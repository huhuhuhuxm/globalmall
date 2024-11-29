package com.globalmall.user.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.user.generator.entity.UasUser;
import com.globalmall.user.generator.service.UasUserService;
import com.globalmall.user.generator.mapper.UasUserMapper;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【uas_user(用户表，存储用户的基础信息和状态)】的数据库操作Service实现
* @createDate 2024-11-28 22:18:38
*/
@Service
public class UasUserServiceImpl extends ServiceImpl<UasUserMapper, UasUser>
    implements UasUserService{

}




