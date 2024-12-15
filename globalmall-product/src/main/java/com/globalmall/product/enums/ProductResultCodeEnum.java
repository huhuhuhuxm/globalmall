package com.globalmall.product.enums;

import com.globalmall.exception.IResultCode;
import lombok.Getter;

/**
 * 商品模块结果代码枚举
 * @author huxuanming
 * @version 1.0
 * @date 2024/12/15 22:56
 */
@Getter
public enum ProductResultCodeEnum implements IResultCode {
    NODE_ERROR( 217, "该分类下有子分类，不可以删除"),
    NO_SUCH_NODE(218, "没有该分类")
    ;

    private Integer code;

    private String message;

    ProductResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
