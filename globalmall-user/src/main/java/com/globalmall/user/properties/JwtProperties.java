package com.globalmall.user.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Jwt相关参数配置
 * @author huxuanming
 * @version 1.0
 * @date 2024/11/29 22:58
 */
@Data
@ConfigurationProperties(prefix = "mall.jwt")
public class JwtProperties {

    // 加密密钥
    private String userName;

    // 有效期
    private long Expire;
}
