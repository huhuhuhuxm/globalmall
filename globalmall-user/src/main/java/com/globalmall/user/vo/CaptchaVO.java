package com.globalmall.user.vo;

import lombok.Data;

/**
 * 验证码VO
 * @author huxuanming
 * @version 1.0
 * @date 2024/12/3 11:59
 */
@Data
public class CaptchaVO {
    // 唯一标识
    private String key;
    // 验证码
    private String Captcha;
}
