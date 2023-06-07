package com.example.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sys.entity.User;

import java.util.List;

/**
 * <p>
 * 用户 Mapper 接口
 * </p>
 *
 * @author chris
 * @since 2023-06-04
 */
public interface UserMapper extends BaseMapper<User> {
    public List<String> getRoleNameByUserId(Integer userId);

}
