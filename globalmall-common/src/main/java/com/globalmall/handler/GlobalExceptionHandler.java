package com.globalmall.handler;

import com.globalmall.exception.GlobalException;
import com.globalmall.result.Result;
import com.globalmall.result.ResultCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 * @author huxuanming
 * @version 1.0
 * @date 2024/11/9 15:04
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 常规异常处理
     * @param ex
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex) {
        log.error("异常信息：{}", ex.getMessage());
        return Result.fail(ResultCodeEnum.SERVICE_ERROR.getCode(), ex.getMessage());
    }

    /**
     * 自定义异常处理
     * @param ex
     * @return
     */
    @ExceptionHandler(GlobalException.class)
    public Result doGlobalException(GlobalException ex) {
        log.error("异常代码：{} 异常信息：{}", ex.getCode(), ex.getMessage());
        return Result.fail(ex.getCode(), ex.getMessage());
    }


    /**
     * 参数异常处理
     * @param ex
     * @return
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public Result doIllegalArgumentException(IllegalArgumentException ex) {
        log.error("捕获到非法参数异常：{}", ex.getMessage());
        return Result.fail(ResultCodeEnum.FAIL.getCode(), ex.getMessage());
    }

}
