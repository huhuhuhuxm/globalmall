package com.globalmall.exception;

import lombok.Getter;

/**
 * 全局统一异常类
 * @author huxuanming
 * @version 1.0
 * @date 2024/11/9 14:09
 */
@Getter
public class GlobalException extends RuntimeException {
    // 状态码
    private Integer code;

    /**
     * 通过状态码和错误消息创建异常对象
     * @param code
     * @param message
     */
    public GlobalException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    /**
     * 接受枚举类对象枚举类
     * @param resultCodeEnum
     */
    public <T extends IResultCode> GlobalException(T resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }
}
