package com.xinxiangweb.gulimall.coupon.dao;

import com.xinxiangweb.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author xinruiliu
 * @email xinrui.liu.1030@gmail.com
 * @date 2023-04-13 23:54:56
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
