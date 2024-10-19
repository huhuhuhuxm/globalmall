package com.globalmall.ware.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.ware.generator.entity.PurchaseDetail;
import com.globalmall.ware.generator.mapper.PurchaseDetailMapper;
import com.globalmall.ware.generator.service.PurchaseDetailService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【wms_purchase_detail】的数据库操作Service实现
* @createDate 2024-10-18 12:57:39
*/
@Service
@DubboService
public class PurchaseDetailServiceImpl extends ServiceImpl<PurchaseDetailMapper, PurchaseDetail>
    implements PurchaseDetailService {

}




