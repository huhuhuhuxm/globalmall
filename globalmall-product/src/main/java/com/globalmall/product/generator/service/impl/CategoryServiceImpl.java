package com.globalmall.product.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.product.generator.entity.Category;
import com.globalmall.product.generator.mapper.CategoryMapper;
import com.globalmall.product.generator.service.CategoryService;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【pms_category(商品三级分类)】的数据库操作Service实现
* @createDate 2024-10-18 12:53:16
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService {

}




