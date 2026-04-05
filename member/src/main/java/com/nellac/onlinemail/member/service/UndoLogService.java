package com.nellac.onlinemail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nellac.common.utils.PageUtils;
import com.nellac.onlinemail.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author nellac
 * @email nellac@163.com
 * @date 2026-04-05 09:40:31
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

