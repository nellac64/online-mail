package com.nellac.onlinemail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nellac.common.utils.PageUtils;
import com.nellac.onlinemail.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author nellac
 * @email sunlightcs@gmail.com
 * @date 2026-04-04 11:28:28
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

