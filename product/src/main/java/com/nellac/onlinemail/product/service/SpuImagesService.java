package com.nellac.onlinemail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nellac.common.utils.PageUtils;
import com.nellac.onlinemail.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author nellac
 * @email sunlightcs@gmail.com
 * @date 2026-04-04 11:28:28
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

