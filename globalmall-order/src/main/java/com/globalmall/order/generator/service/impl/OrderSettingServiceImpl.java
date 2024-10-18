package com.globalmall.order.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.order.generator.entity.OrderSetting;
import com.globalmall.order.generator.service.OrderSettingService;
import com.globalmall.order.generator.mapper.OrderSettingMapper;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【oms_order_setting(订单配置信息)】的数据库操作Service实现
* @createDate 2024-10-18 12:51:33
*/
@Service
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingMapper, OrderSetting>
    implements OrderSettingService{

}




