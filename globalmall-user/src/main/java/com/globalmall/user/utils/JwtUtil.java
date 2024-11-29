package com.globalmall.user.utils;

import com.globalmall.user.constant.JwtConstant;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;


import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Jwt工具类
 * @author huxuanming
 * @version 1.0
 * @date 2024/11/28 23:12
 */
@Slf4j
public class JwtUtil {

    //创建一个jwt密钥 加密和解密都需要用这个玩意
    private static final SecretKey KEY = Keys.hmacShaKeyFor(JwtConstant.JWT_SECRET.getBytes(StandardCharsets.UTF_8));

    /**
     * 使用默认过期时间（7天），生成一个JWT
     *
     * @param username 用户名
     * @param claims   JWT中的数据
     * @return
     */
    public static String createToken(String username, Map<String, Object> claims) {
        return createToken(username, claims, JwtConstant.JWT_DEFAULT_EXPIRE);
    }

    /**
     * 生成token
     *
     * @param username 用户名
     * @param claims   请求体数据
     * @param expire   过期时间 单位：毫秒
     * @return token
     */
    public static String createToken(String username, Map<String, Object> claims, Long expire) {
        JwtBuilder builder = Jwts.builder();
        Date now = new Date();
        // 生成token
        builder.id(JwtConstant.JWT_ID) //id 这个可以不填，但是建议填
                .issuer(JwtConstant.JWT_ISSUER) //签发者
                .claims(claims) //数据
                .subject(username) //主题
                .issuedAt(now) //签发时间
                .expiration(new Date(now.getTime() + expire)) //过期时间
                .signWith(KEY); //签名方式
        builder.header()
                .add("type", "JWT")
                .add("alg", "HS256 or HS512 or 384");
        return builder.compact();
    }

    /**
     * 解析token
     *
     * @param token jwt token
     * @return Claims
     */
    public static Claims parseToken(String token) {
        try {
            Jws<Claims> jws = Jwts.parser()
                    .verifyWith(KEY)
                    .build()
                    .parseSignedClaims(token);
            return jws.getPayload();
        } catch (Exception e) {
            if (e instanceof ExpiredJwtException) {
                //现在不需要使用 claims.getExpiration().before(new Date());
                // 判断JWT是否过期了 如果过期会抛出ExpiredJwtException异常
                log.error("token已过期");
            }
            if (e instanceof JwtException) {
                log.error("token已失效" + e);
            }
            log.error("jwt解析失败" + e);
            throw new RuntimeException(e);
        }
    }

    /**
     * 获取jwt头部信息
     *
     * @param token
     * @return
     */
    public static JwsHeader parseHeader(String token) {
        try {
            Jws<Claims> jws = Jwts.parser()
                    .verifyWith(KEY)
                    .build()
                    .parseSignedClaims(token);
            return jws.getHeader();
        } catch (Exception e) {
            if (e instanceof ExpiredJwtException) {
                //现在不需要使用 claims.getExpiration().before(new Date());
                // 判断JWT是否过期了 如果过期会抛出ExpiredJwtException异常
                log.error("token已过期");
            }
            if (e instanceof JwtException) {
                log.error("token已失效" + e);
            }
            log.error("jwt解析失败" + e);
            throw new RuntimeException(e);
        }
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        // 生成token
        Map<String, Object> claims = new HashMap<>();
        claims.put("name", "huxuanming");
        claims.put("age", 21);
        String token = createToken("huxuanmimg", claims);
        System.out.println(token + "====>" +token.length());

        // 解析token
        System.out.println(parseToken(token));

        // 获取头部信息
        System.out.println(parseHeader(token));

    }
}
