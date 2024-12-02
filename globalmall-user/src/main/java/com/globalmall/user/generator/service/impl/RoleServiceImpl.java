package com.globalmall.user.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.user.generator.entity.Role;
import com.globalmall.user.generator.service.RoleService;
import com.globalmall.user.generator.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【uas_role(角色表，定义系统中的用户角色)】的数据库操作Service实现
* @createDate 2024-12-01 23:01:31
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




