package com.xinxiangweb.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xinxiangweb.common.utils.PageUtils;
import com.xinxiangweb.gulimall.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author xinruiliu
 * @email xinrui.liu.1030@gmail.com
 * @date 2023-04-13 23:54:56
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

