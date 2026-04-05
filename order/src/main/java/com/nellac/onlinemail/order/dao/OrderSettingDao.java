package com.nellac.onlinemail.order.dao;

import com.nellac.onlinemail.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author nellac
 * @email nellac@163.com
 * @date 2026-04-04 21:33:59
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
