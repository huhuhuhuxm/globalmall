package com.globalmall.product.controller;

import com.globalmall.product.generator.entity.Category;
import com.globalmall.product.generator.service.CategoryService;
import com.globalmall.product.vo.CategoryTreeVO;
import com.globalmall.result.Result;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品分类
 * @author huxuanming
 * @version 1.0
 * @date 2024/11/9 13:26
 */
@Slf4j
@RestController
@RequestMapping("/product/v1/category")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CategoryController {
    CategoryService categoryService;

    /**
     * 查询出所有商品分类，结果以树形结构返回
     * @return
     */
    @GetMapping("/list/tree")
    public Result<List<CategoryTreeVO>> getCategoryTreeList() {
        List<CategoryTreeVO> categoryList = categoryService.listWithTree();
        return Result.success(categoryList);
    }

}
