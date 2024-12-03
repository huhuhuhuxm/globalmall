package com.globalmall.user.generator.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.exception.GlobalException;
import com.globalmall.result.ResultCodeEnum;
import com.globalmall.user.dto.UserLoginDTO;
import com.globalmall.user.generator.entity.User;
import com.globalmall.user.generator.service.UserService;
import com.globalmall.user.generator.mapper.UserMapper;
import com.globalmall.user.utils.CaptchaUtil;
import com.globalmall.user.utils.JwtUtil;
import com.globalmall.user.vo.UserLoginVO;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


/**
* @author hxm
* @description 针对表【uas_user(用户表，存储用户的基础信息和状态)】的数据库操作Service实现
* @createDate 2024-12-03 13:36:33
*/
@Slf4j
@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    UserMapper userMapper;

    /**
     * 用户登录
     * @param userLoginDTO
     * @return
     */
    @Override
    public UserLoginVO login(UserLoginDTO userLoginDTO) {
        // 1.验证验证码准确性
        String key = userLoginDTO.getKey();
        log.info("key: {}", key);
        String captcha = userLoginDTO.getCaptcha();
        log.info("captcha：{}", captcha);

        boolean isValid = CaptchaUtil.validateCaptcha(key, captcha);
        // 验证码是否有效 无效则抛出异常
        if (!isValid) {
            throw new GlobalException(ResultCodeEnum.VALIDATECODE_ERROR);
        }
        // 从根据账号在数据库中查询
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.eq(User::getAccount, userLoginDTO.getAccount());
        User user = userMapper.selectOne(lqw);
        System.out.println(user);
        // 判断是否有注册
        if (user == null) {
            throw new GlobalException(ResultCodeEnum.ACCOUNT_NOT_REGISTERED);
        }
        // 判断密码是否正确 密码通过md5加密
        String password = DigestUtils.md5Hex(userLoginDTO.getPassword());
        if (!password.equals(user.getPassword())) {
            throw new GlobalException(ResultCodeEnum.PASSWORD_ERROR);
        }

        // 生成token
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", user.getId());
        claims.put("account", user.getAccount());
        String token = JwtUtil.createToken(user.getAccount(), claims);
        // 封装UserLoginVO
        UserLoginVO userLoginVO = new UserLoginVO();
        userLoginVO.setUserId(user.getId());
        userLoginVO.setAccount(user.getAccount());
        userLoginVO.setType(user.getType());
        userLoginVO.setStatus(user.getStatus());
        userLoginVO.setToken(token);

        return userLoginVO;
    }
}




