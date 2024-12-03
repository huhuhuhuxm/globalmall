package com.globalmall.user.controller;

import com.globalmall.exception.GlobalException;
import com.globalmall.result.Result;
import com.globalmall.result.ResultCodeEnum;
import com.globalmall.user.dto.UserLoginDTO;
import com.globalmall.user.generator.service.UserService;
import com.globalmall.user.utils.CaptchaUtil;
import com.globalmall.user.vo.CaptchaVO;
import com.globalmall.user.vo.UserLoginVO;
import com.globalmall.util.UUIDUtil;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    UserService userService;


    /**
     * 用户登录
     * @param userLoginDTO
     * @return
     */
    @PostMapping("/login")
    public Result<UserLoginVO> login(@RequestBody UserLoginDTO userLoginDTO) {
        // 封装UserLoginVO
        UserLoginVO userLoginVO = userService.login(userLoginDTO);
        return Result.success(userLoginVO);
    }

    /**
     * 用户注册
     * @return
     */
    @PostMapping("/register")
    public Result register() {
        return null;
    }

    /**
     * 生成验证码
     * @return
     */
    @GetMapping("/generateCaptcha")
    public Result<CaptchaVO> generateCaptcha() {
        // 用uuid生成唯一标识
        String key = UUIDUtil.generateUUID();
        log.info("key: {}", key);
        // 生成验证码 并返回
        String captcha = CaptchaUtil.generateCaptcha(key);
        log.info("captcha：{}", captcha);

        //封装captchaVO
        CaptchaVO captchaVO = new CaptchaVO();
        captchaVO.setKey(key);
        captchaVO.setCaptcha(captcha);
        return Result.success(captchaVO) ;
    }

}
