package com.globalmall.user.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.user.generator.entity.UasUserRole;
import com.globalmall.user.generator.service.UasUserRoleService;
import com.globalmall.user.generator.mapper.UasUserRoleMapper;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【uas_user_role(用户角色映射表，存储用户与角色的多对多关系)】的数据库操作Service实现
* @createDate 2024-11-28 22:18:38
*/
@Service
public class UasUserRoleServiceImpl extends ServiceImpl<UasUserRoleMapper, UasUserRole>
    implements UasUserRoleService{

}




