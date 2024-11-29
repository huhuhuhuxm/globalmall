package com.globalmall.user.constant;

/**
 * jwt常量
 * @author huxuanming
 * @version 1.0
 * @date 2024/11/29 23:39
 */
public class JwtConstant {
    // 密钥
    public static final String JWT_SECRET = "S/4AN9IsSRUC~{0c4]y#$F2XbV8^`#a14vawn<~Kr@(D%3TF-p1s/h{Y9k7y((rR";

    // 默认有效期
    public static final long JWT_DEFAULT_EXPIRE = 1000 * 60 * 60 * 24 * 7L;

    // id
    public static final String JWT_ID = "GlobalMall";

    // issuer
    public static final String JWT_ISSUER = "GlobalMall";

}
