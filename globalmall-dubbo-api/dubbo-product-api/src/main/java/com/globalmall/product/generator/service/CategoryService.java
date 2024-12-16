package com.globalmall.product.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.globalmall.product.generator.entity.Category;
import com.globalmall.product.vo.CategoryTreeVO;

import java.util.List;

/**
* @author hxm
* @description 针对表【pms_category(商品三级分类)】的数据库操作Service
* @createDate 2024-10-18 12:53:16
*/
public interface CategoryService extends IService<Category> {

    /**
     * 查询出所有商品分类，结果以树形结构返回
     * @return
     */
    List<CategoryTreeVO> listWithTree();

    /**
     * 批量删除分类节点
     * @param cartIds
     * @return
     */
    boolean deleteCategories(Long[] cartIds);
}
