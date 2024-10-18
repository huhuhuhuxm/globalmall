package com.globalmall;

import com.globalmall.coupon.generator.entity.Coupon;
import com.globalmall.coupon.generator.mapper.CouponMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GlobalmallCouponApplicationTests {

    @Autowired
    private CouponMapper couponMapper;

    @Test
    void contextLoads() {
        List<Coupon> coupons = couponMapper.selectList(null);
        System.out.println(coupons);
    }

}
