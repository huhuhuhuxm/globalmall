package com.globalmall.product.vo;

import com.globalmall.product.generator.entity.Category;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author huxuanming
 * @version 1.0
 * @date 2024/11/9 19:35
 */
@Data
//@SuperBuilder 先注释
@NoArgsConstructor
public class CategoryTreeVO extends Category {
    /**
     * 子节点
     */
    private List<CategoryTreeVO> children;
}
