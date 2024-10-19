package com.globalmall.order.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.order.generator.entity.OrderItem;
import com.globalmall.order.generator.mapper.OrderItemMapper;
import com.globalmall.order.generator.service.OrderItemService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【oms_order_item(订单项信息)】的数据库操作Service实现
* @createDate 2024-10-18 12:51:33
*/
@Service
@DubboService
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem>
    implements OrderItemService {

}




