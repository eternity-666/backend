package com.example.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sys.entity.UserRole;
import com.example.sys.mapper.UserRoleMapper;
import com.example.sys.service.IUserRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色鱼用户关联 服务实现类
 * </p>
 *
 * @author chris
 * @since 2023-06-04
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
