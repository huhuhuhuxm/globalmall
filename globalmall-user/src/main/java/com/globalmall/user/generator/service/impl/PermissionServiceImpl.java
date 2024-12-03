package com.globalmall.user.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.user.generator.entity.Permission;
import com.globalmall.user.generator.service.PermissionService;
import com.globalmall.user.generator.mapper.PermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【uas_permission(权限表，定义系统中的操作权限)】的数据库操作Service实现
* @createDate 2024-12-03 13:36:33
*/
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission>
    implements PermissionService{

}




