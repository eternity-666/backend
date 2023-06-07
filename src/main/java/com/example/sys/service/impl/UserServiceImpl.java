package com.example.sys.service.impl;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.sys.entity.User;
import com.example.sys.mapper.UserMapper;
import com.example.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author chris
 * @since 2023-06-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public Map<String, Object> login(User user) {
        //根据用户名查询用户
        LambdaQueryWrapper<User> wrapper =  new LambdaQueryWrapper<>();
        wrapper.eq(User::getUsername,user.getUsername());

        User loginUser  = this.baseMapper.selectOne(wrapper);
        //如果用户不为空，并且密码·和传入的密码是匹配的，生成token,并将token存入·redis
        if(loginUser != null && passwordEncoder.matches(user.getPassword(),loginUser.getPassword())){
            //暂时用uuid代替token，终极方案是用jwt生成token
            String key = "user:"+ UUID.randomUUID();

            loginUser.setPassword(null);
            redisTemplate.opsForValue().set(key,loginUser,30, TimeUnit.MINUTES);


            //返回数据
            Map<String,Object> data = new HashMap<>();
            data.put("token",key);
            return data;
        }
        return null;
    }

//    @Override
//    public Map<String, Object> login(User user) {
//        //根据用户名和密码查询用户
//       LambdaQueryWrapper<User> wrapper =  new LambdaQueryWrapper<>();
//             wrapper.eq(User::getUsername,user.getUsername());
//            wrapper.eq(User::getPassword,user.getPassword());
//            User loginUser  = this.baseMapper.selectOne(wrapper);
//            //如果用户不为空，生成token,并将token存入·redis
//            if(loginUser != null){
//                //暂时用uuid代替token，终极方案是用jwt生成token
//               String key = "user:"+ UUID.randomUUID();
//
//               loginUser.setPassword(null);
//               redisTemplate.opsForValue().set(key,loginUser,30, TimeUnit.MINUTES);
//
//
//               //返回数据
//               Map<String,Object> data = new HashMap<>();
//                data.put("token",key);
//                return data;
//            }
//        return null;
//    }

    @Override
    public Map<String, Object> getUserInfo(String token) {
        //根据token获取用户信息
       Object obj  = redisTemplate.opsForValue().get(token);
         if(obj != null){
            User loginUser = JSON.parseObject(JSON.toJSONString(obj),User.class);
            Map<String,Object> data = new HashMap<>();

            data.put("name",loginUser.getUsername());
            data.put("avatar",loginUser.getAvatar());

            //角色权限暂时写死
           List<String> roleList =  this.baseMapper.getRoleNameByUserId(loginUser.getUserId());
            data.put("roles",roleList);

            return data;


         }
          return null;

    }

    @Override
    public void logout(String token) {
        redisTemplate.delete(token);
    }


}
