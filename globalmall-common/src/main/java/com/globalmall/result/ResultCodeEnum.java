package com.globalmall.result;

import com.globalmall.exception.IResultCode;
import lombok.Getter;

/**
 * 统一返回结果状态信息类
 * @author huxuanming
 * @version 1.0
 * @date 2024/11/9 13:56
 */
@Getter
public enum ResultCodeEnum implements IResultCode {
    SUCCESS(200,"成功"),
    FAIL(201, "失败"),
    SERVICE_ERROR(2012, "服务异常"),
    DATA_ERROR(204, "数据异常"),
    ILLEGAL_REQUEST(205, "非法请求"),
    REPEAT_SUBMIT(206, "重复提交"),
    FEIGN_FAIL(207, "远程调用失败"),
    UPDATE_ERROR(204, "数据更新失败"),

    ARGUMENT_VALID_ERROR(210, "参数校验异常"),
    SIGN_ERROR(300, "签名错误"),
    SIGN_OVERDUE(301, "签名已过期"),
    VALIDATECODE_ERROR(218 , "验证码错误"),

    LOGIN_AUTH(208, "未登陆"),
    PERMISSION(209, "没有权限"),
    ACCOUNT_NOT_REGISTERED(210, "账号未注册，请注册再登录"),
    ACCOUNT_REGISTER_SUCCESS(211, "账号注册成功，请重新登录"),
    ACCOUNT_HAS_BEEN_REGISTERED(212, "账号已被注册"),
    ACCOUNT_ERROR(214, "账号不正确"),
    PASSWORD_ERROR(215, "密码不正确"),
    PHONE_CODE_ERROR(215, "手机验证码不正确"),
    LOGIN_MOBLE_ERROR( 216, "账号不正确"),
    ACCOUNT_STOP( 216, "账号已停用"),
    NODE_ERROR( 217, "该节点下有子节点，不可以删除"),
    ;

    private Integer code;

    private String message;

    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
