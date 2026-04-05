package com.nellac.onlinemail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nellac.common.utils.PageUtils;
import com.nellac.onlinemail.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author nellac
 * @email nellac@163.com
 * @date 2026-04-04 21:33:59
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

