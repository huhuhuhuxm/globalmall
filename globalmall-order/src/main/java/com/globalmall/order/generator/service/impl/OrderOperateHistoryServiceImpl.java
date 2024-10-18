package com.globalmall.order.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.order.generator.entity.OrderOperateHistory;
import com.globalmall.order.generator.service.OrderOperateHistoryService;
import com.globalmall.order.generator.mapper.OrderOperateHistoryMapper;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【oms_order_operate_history(订单操作历史记录)】的数据库操作Service实现
* @createDate 2024-10-18 12:51:33
*/
@Service
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryMapper, OrderOperateHistory>
    implements OrderOperateHistoryService{

}




