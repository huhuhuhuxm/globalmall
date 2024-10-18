package com.globalmall.order.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.order.generator.entity.Order;
import com.globalmall.order.generator.service.OrderService;
import com.globalmall.order.generator.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【oms_order(订单)】的数据库操作Service实现
* @createDate 2024-10-18 12:51:33
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

}




