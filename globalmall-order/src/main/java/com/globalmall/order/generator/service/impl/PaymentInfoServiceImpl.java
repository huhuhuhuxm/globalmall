package com.globalmall.order.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.order.generator.entity.PaymentInfo;
import com.globalmall.order.generator.service.PaymentInfoService;
import com.globalmall.order.generator.mapper.PaymentInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【oms_payment_info(支付信息表)】的数据库操作Service实现
* @createDate 2024-10-18 12:51:33
*/
@Service
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo>
    implements PaymentInfoService{

}




