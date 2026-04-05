package com.nellac.onlinemail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nellac.common.utils.PageUtils;
import com.nellac.onlinemail.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author nellac
 * @email sunlightcs@gmail.com
 * @date 2026-04-04 11:28:28
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

