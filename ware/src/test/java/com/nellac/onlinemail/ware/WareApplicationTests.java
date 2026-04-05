package com.nellac.onlinemail.ware;

import com.nellac.onlinemail.ware.entity.PurchaseEntity;
import com.nellac.onlinemail.ware.service.PurchaseService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WareApplication.class)
class WareApplicationTests {

    @Autowired
    PurchaseService purchaseService;

    @Test
    void contextLoads() {

        PurchaseEntity purchaseEntity = new PurchaseEntity();
        purchaseEntity.setPhone("123456");
        purchaseEntity.setAssigneeName("123456");

        purchaseService.save(purchaseEntity);

    }

}
