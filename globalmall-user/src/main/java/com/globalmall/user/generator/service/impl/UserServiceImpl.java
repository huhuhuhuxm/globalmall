package com.globalmall.user.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.user.generator.entity.User;
import com.globalmall.user.generator.service.UserService;
import com.globalmall.user.generator.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【uas_user(用户表，存储用户的基础信息和状态)】的数据库操作Service实现
* @createDate 2024-12-01 23:01:31
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




