package com.nellac.onlinemail.member.dao;

import com.nellac.onlinemail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author nellac
 * @email nellac@163.com
 * @date 2026-04-05 09:40:32
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
