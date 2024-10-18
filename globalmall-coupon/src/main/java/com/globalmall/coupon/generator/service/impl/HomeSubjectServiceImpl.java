package com.globalmall.coupon.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.coupon.generator.entity.HomeSubject;
import com.globalmall.coupon.generator.service.HomeSubjectService;
import com.globalmall.coupon.generator.mapper.HomeSubjectMapper;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【sms_home_subject(首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】)】的数据库操作Service实现
* @createDate 2024-10-18 13:25:58
*/
@Service
public class HomeSubjectServiceImpl extends ServiceImpl<HomeSubjectMapper, HomeSubject>
    implements HomeSubjectService{

}




