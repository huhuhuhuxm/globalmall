package com.globalmall.user.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.user.generator.entity.UmsRolePermission;
import com.globalmall.user.generator.service.UmsRolePermissionService;
import com.globalmall.user.generator.mapper.UmsRolePermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【ums_role_permission(角色权限映射表，存储角色与权限的多对多关系)】的数据库操作Service实现
* @createDate 2024-11-28 22:18:38
*/
@Service
public class UmsRolePermissionServiceImpl extends ServiceImpl<UmsRolePermissionMapper, UmsRolePermission>
    implements UmsRolePermissionService{

}




