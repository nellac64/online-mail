package com.nellac.onlinemail.member.dao;

import com.nellac.onlinemail.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author nellac
 * @email nellac@163.com
 * @date 2026-04-05 09:40:31
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
