package com.globalmall.product.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.product.generator.entity.AttrAttrgroupRelation;
import com.globalmall.product.generator.mapper.AttrAttrgroupRelationMapper;
import com.globalmall.product.generator.service.AttrAttrgroupRelationService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【pms_attr_attrgroup_relation(属性&属性分组关联)】的数据库操作Service实现
* @createDate 2024-10-18 12:53:16
*/
@Service
@DubboService
public class AttrAttrgroupRelationServiceImpl extends ServiceImpl<AttrAttrgroupRelationMapper, AttrAttrgroupRelation>
    implements AttrAttrgroupRelationService {

}




