package com.globalmall.member.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.member.generator.entity.GrowthChangeHistory;
import com.globalmall.member.generator.mapper.GrowthChangeHistoryMapper;
import com.globalmall.member.generator.service.GrowthChangeHistoryService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【ums_growth_change_history(成长值变化历史记录)】的数据库操作Service实现
* @createDate 2024-10-18 12:50:17
*/
@Service
@DubboService
public class GrowthChangeHistoryServiceImpl extends ServiceImpl<GrowthChangeHistoryMapper, GrowthChangeHistory>
    implements GrowthChangeHistoryService {

}




