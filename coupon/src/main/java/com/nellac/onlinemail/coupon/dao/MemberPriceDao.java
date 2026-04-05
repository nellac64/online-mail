package com.nellac.onlinemail.coupon.dao;

import com.nellac.onlinemail.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author nellac
 * @email nellac@163.com
 * @date 2026-04-05 09:31:43
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
