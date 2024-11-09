package com.globalmall.result;

import lombok.Data;

/**
 * 全局统一返回类
 * @author huxuanming
 * @version 1.0
 * @date 2024/11/9 13:53
 */
@Data
public class Result<T> {
    // 返回码
    private Integer code;

    // 返回消息
    private String message;

    // 返回数据
    private T data;

    /**
     * 请求成功
     * @param data
     * @return
     * @param <T>
     */
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.code = ResultCodeEnum.SUCCESS.getCode();
        result.message = ResultCodeEnum.SUCCESS.getMessage();
        result.data = data;
        return result;
    }

    /**
     * 自定义请求成功
     * @param code
     * @param message
     * @param data
     * @return
     * @param <T>
     */
    public static <T> Result<T> success(Integer code, String message, T data) {
        Result<T> result = new Result<>();
        result.code = code;
        result.message = message;
        result.data = data;
        return result;
    }

    /**
     * 自定义请求成功
     * @param code
     * @param message
     * @return
     * @param <T>
     */
    public static <T> Result<T> success(Integer code, String message) {
        Result<T> result = new Result<>();
        result.code = code;
        result.message = message;
        return result;
    }


    /**
     * 请求失败
     * @param data
     * @return
     * @param <T>
     */
    public static <T> Result<T> fail(T data) {
        Result<T> result = new Result<>();
        result.code = ResultCodeEnum.FAIL.getCode();
        result.message = ResultCodeEnum.FAIL.getMessage();
        return result;
    }

    /**
     * 自定义请求失败
     * @param code
     * @param message
     * @return
     * @param <T>
     */
    public static <T> Result<T> fail(Integer code, String message) {
        Result<T> result = new Result<>();
        result.code = code;
        result.message = message;
        return result;
    }

}
