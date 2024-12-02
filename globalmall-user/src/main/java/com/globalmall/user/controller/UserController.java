package com.globalmall.user.controller;

import com.globalmall.exception.GlobalException;
import com.globalmall.result.Result;
import com.globalmall.result.ResultCodeEnum;
import com.globalmall.user.dto.UserLoginDTO;
import com.globalmall.user.generator.service.UserService;
import com.globalmall.user.utils.CaptchaUtil;
import com.globalmall.user.vo.UserLoginVO;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户相关接口
 * @author huxuanming
 * @version 1.0
 * @date 2024/11/30 14:11
 */
@Slf4j
@RestController
@RequestMapping("/user/v1/")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    //用户服务
//    UserService userService;

    /**
     * 用户登录
     * @param userLoginDTO
     * @return
     */
    @PostMapping("/login")
    public Result<UserLoginVO> login(@RequestBody UserLoginDTO userLoginDTO) {
        // 1.验证验证码准确性 ⚠️这里account当做生成验证码的key！！！
        String account = userLoginDTO.getAccount();
        String captcha = userLoginDTO.getCaptcha();
        boolean isValid = CaptchaUtil.validateCaptcha(account, captcha);
        // 验证码是否有效 无效则抛出异常
        // TODO 验证码应该存到redis
        if (!isValid) {
            throw new GlobalException(ResultCodeEnum.VALIDATECODE_ERROR);
        }

        return null;
    }

    /**
     * 用户注册
     * @return
     */
    @PostMapping("/register")
    public Result register() {
        return null;
    }

}
