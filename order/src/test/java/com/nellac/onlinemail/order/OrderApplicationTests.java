package com.nellac.onlinemail.order;

import com.nellac.onlinemail.order.entity.OrderItemEntity;
import com.nellac.onlinemail.order.service.OrderItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderApplication.class)
class OrderApplicationTests {

    @Autowired
    OrderItemService orderItemService;

    @Test
    void contextLoads() {

        OrderItemEntity orderItemEntity = new OrderItemEntity();
        orderItemEntity.setOrderId(20260404123456L);
        orderItemEntity.setOrderSn("test order item");

        orderItemService.save(orderItemEntity);

    }

}
