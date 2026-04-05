package com.nellac.onlinemail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nellac.common.utils.PageUtils;
import com.nellac.onlinemail.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author nellac
 * @email nellac@163.com
 * @date 2026-04-05 10:05:03
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

