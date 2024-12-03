package com.globalmall.user.dto;

import lombok.Data;

/**
 * 用户注册DTO
 * @author huxuanming
 * @version 1.0
 * @date 2024/12/1 23:27
 */
@Data
public class UserRegisterDTO extends UserLoginDTO {
    // 用户类型 0: 管理员 2：商家 3：普通用户
    private int type;
}
