package com.globalmall.member.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.globalmall.member.generator.entity.Member;
import com.globalmall.member.generator.mapper.MemberMapper;
import com.globalmall.member.generator.service.MemberService;
import org.springframework.stereotype.Service;

/**
* @author hxm
* @description 针对表【ums_member(会员)】的数据库操作Service实现
* @createDate 2024-10-18 12:50:17
*/
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member>
    implements MemberService {

}




