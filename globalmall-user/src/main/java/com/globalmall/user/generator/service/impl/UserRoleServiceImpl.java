package com.globalmall.user.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.user.generator.entity.UserRole;
import com.globalmall.user.generator.service.UserRoleService;
import com.globalmall.user.generator.mapper.UserRoleMapper;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【uas_user_role(用户角色映射表，存储用户与角色的多对多关系)】的数据库操作Service实现
* @createDate 2024-12-01 23:01:31
*/
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole>
    implements UserRoleService{

}




