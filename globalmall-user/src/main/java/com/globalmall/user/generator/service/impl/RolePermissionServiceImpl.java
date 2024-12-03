package com.globalmall.user.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.user.generator.entity.RolePermission;
import com.globalmall.user.generator.service.RolePermissionService;
import com.globalmall.user.generator.mapper.RolePermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【uas_role_permission(角色权限映射表，存储角色与权限的多对多关系)】的数据库操作Service实现
* @createDate 2024-12-03 13:36:33
*/
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission>
    implements RolePermissionService{

}




