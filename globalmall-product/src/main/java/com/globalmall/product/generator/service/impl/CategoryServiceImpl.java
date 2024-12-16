package com.globalmall.product.generator.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.exception.GlobalException;
import com.globalmall.product.constant.CategoryConstant;
import com.globalmall.product.enums.ProductResultCodeEnum;
import com.globalmall.product.generator.entity.Category;
import com.globalmall.product.generator.mapper.CategoryMapper;
import com.globalmall.product.generator.service.CategoryService;
import com.globalmall.product.vo.CategoryTreeVO;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


/**
 * @author hxm
 * @description 针对表【pms_category(商品三级分类)】的数据库操作Service实现
 * @createDate 2024-10-18 12:53:16
 */
@Slf4j
@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
        implements CategoryService {

    CategoryMapper categoryMapper;

    /**
     * 查询出所有商品分类，结果以树形结构返回
     *
     * @return
     */
    @Override
    public List<CategoryTreeVO> listWithTree() {
        // 查询出所有商品先
        List<Category> categoryList = categoryMapper.selectList(null);
        // 构建树形返回结构
        List<CategoryTreeVO> CategoryTreeList = categoryList.stream()
                .filter((item) -> item.getParentCid().equals(0L)) // 删选出父级菜单
                .map((item) -> {
                    CategoryTreeVO categoryTreeVO = new CategoryTreeVO();
                    BeanUtils.copyProperties(item, categoryTreeVO);
                    categoryTreeVO.setChildren(this.getChildren(item.getCatId(), categoryList));
                    return categoryTreeVO;
                })
                .sorted(Comparator.comparingInt(Category::getSort))
                .toList();
        return CategoryTreeList;
    }

    /**
     * 批量删除分类节点
     *
     * @param cartIds
     * @return
     */
    @Override
    public boolean deleteCategories(Long[] cartIds) {
        // 筛选出符合删除条件的cartId
        List<Long> list = Arrays.stream(cartIds).distinct().filter(cartId -> cartId >= 0).filter(cartId -> {
            Category category = categoryMapper.selectById(cartId);
            log.info("category：{}", category);
            if (category == null) {
                return false;
            }
            // 查询该节点是否有子节点 有子节点无法删除 层级最多为3层
            if (!category.getCatLevel().equals(CategoryConstant.THIRD_LEVEN)) {
                List<Category> categoryList = categoryMapper.selectList(new LambdaQueryWrapper<Category>().eq(Category::getParentCid, cartId));
                log.info("categoryList：{}", categoryList);
                if (!categoryList.isEmpty()) {
                    return false;
                }
            }
            return true;
        }).toList();
        log.info("符合删除条件的cartId：{}", list);
        // 逻辑删除 把Category对象中的showStatus当做逻辑删除字段
        if (list.isEmpty()) {
            throw new GlobalException(ProductResultCodeEnum.NO_CATEGORIES_MATCH_DELETE_CONDITIONS);
        }
        categoryMapper.deleteByIds(list);
        return true;
    }


    /**
     * 选出子节点 利用递归
     *
     * @param parentCid
     * @param categoryList
     * @return
     */
    private List<CategoryTreeVO> getChildren(Long parentCid, List<Category> categoryList) {
        return categoryList.stream().filter(item -> parentCid.equals(item.getParentCid()))
                .map(item -> {
                    CategoryTreeVO categoryTreeVO = new CategoryTreeVO();
                    BeanUtils.copyProperties(item, categoryTreeVO);
                    categoryTreeVO.setChildren(this.getChildren(item.getCatId(), categoryList));
                    return categoryTreeVO;
                })
                .sorted(Comparator.comparingInt(Category::getSort))
                .toList();
    }
}




