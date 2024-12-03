package com.globalmall.user.dto;

import lombok.Data;

/**
 * 验证码DTO
 * @author huxuanming
 * @version 1.0
 * @date 2024/12/2 23:27
 */
@Data
public class CaptchaDTO {
    // 唯一标识
    private String key;
    // 验证码
    private String Captcha;
}
