package com.globalmall.user.dto;

import lombok.Data;

/**
 * 用户登录DTO
 * @author huxuanming
 * @version 1.0
 * @date 2024/11/30 22:13
 */
@Data
public class UserLoginDTO {
    // 账号
    private String account;
    //密码
    private String password;
    //验证码
    private String captcha;
}
