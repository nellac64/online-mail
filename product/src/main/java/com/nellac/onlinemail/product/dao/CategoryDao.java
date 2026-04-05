package com.nellac.onlinemail.product.dao;

import com.nellac.onlinemail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author nellac
 * @email sunlightcs@gmail.com
 * @date 2026-04-04 11:28:28
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
