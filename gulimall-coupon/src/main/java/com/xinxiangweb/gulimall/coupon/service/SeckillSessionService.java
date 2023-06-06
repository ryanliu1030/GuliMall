package com.xinxiangweb.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xinxiangweb.common.utils.PageUtils;
import com.xinxiangweb.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author xinruiliu
 * @email xinrui.liu.1030@gmail.com
 * @date 2023-04-13 23:54:56
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

