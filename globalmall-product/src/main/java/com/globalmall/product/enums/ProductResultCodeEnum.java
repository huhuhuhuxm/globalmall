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
    CATEGORY_ERROR( 217, "该分类下有子分类，不可以删除"),
    NO_SUCH_CATEGORY(218, "没有该分类"),
    NO_MATCHING_CATEGORY(219, "没有符合条件的分类"),
    NO_CATEGORIES_MATCH_DELETE_CONDITIONS(220, "没有符合删除条件的分类")
    ;

    private Integer code;

    private String message;

    ProductResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
