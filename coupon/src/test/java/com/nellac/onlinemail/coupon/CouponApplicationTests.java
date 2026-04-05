package com.nellac.onlinemail.coupon;

import com.nellac.onlinemail.coupon.entity.CouponEntity;
import com.nellac.onlinemail.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CouponApplication.class)
class CouponApplicationTests {

    @Autowired
    CouponService couponService;

    @Test
    void contextLoads() {

        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setId(20260404123456L);
        couponEntity.setCode("12346");

        couponService.save(couponEntity);

    }

}
