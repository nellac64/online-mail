package com.nellac.onlinemail.order.dao;

import com.nellac.onlinemail.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author nellac
 * @email nellac@163.com
 * @date 2026-04-04 21:33:59
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
