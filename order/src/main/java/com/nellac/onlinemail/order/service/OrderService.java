package com.nellac.onlinemail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nellac.common.utils.PageUtils;
import com.nellac.onlinemail.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author nellac
 * @email nellac@163.com
 * @date 2026-04-04 21:33:59
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

