package com.globalmall.product.generator.service.impl;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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

import java.util.Comparator;
import java.util.List;


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
     * @return
     */
    @Override
    public List<CategoryTreeVO> listWithTree() {
        // 查询出所有商品先
        List<Category> categoryList = categoryMapper.selectList(null);
        // 构建树形返回结构
        List<CategoryTreeVO> CategoryTreeList = categoryList.stream()
                .filter((item) -> item.getParentCid().equals(0L)) // 删选出父级菜单
                .map((item)-> {
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
     * 选出子节点 利用递归
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




