package com.nellac.onlinemail.coupon.dao;

import com.nellac.onlinemail.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author nellac
 * @email nellac@163.com
 * @date 2026-04-05 09:31:43
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
