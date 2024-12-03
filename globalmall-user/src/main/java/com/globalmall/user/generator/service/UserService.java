package com.globalmall.user.generator.service;

import com.globalmall.user.dto.UserLoginDTO;
import com.globalmall.user.generator.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.globalmall.user.vo.UserLoginVO;

/**
* @author hxm
* @description 针对表【uas_user(用户表，存储用户的基础信息和状态)】的数据库操作Service
* @createDate 2024-12-03 13:36:33
*/
public interface UserService extends IService<User> {

    /**
     * 用户登录
     * @param userLoginDTO
     * @return
     */
    UserLoginVO login(UserLoginDTO userLoginDTO);
}
