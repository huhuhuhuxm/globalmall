package com.globalmall.user.vo;

import lombok.Data;

/**
 * 用户登录响应
 * @author huxuanming
 * @version 1.0
 * @date 2024/12/1 21:20
 */
@Data
public class UserLoginVO {
    // 用户id
    private Long userId;
    // 账号
    private String account;
    // token
    private String token;
    // 类型
    private int type;
    // 状态
    private int status;
}
