package com.xinxiangweb.gulimall.order.dao;

import com.xinxiangweb.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xinruiliu
 * @email xinrui.liu.1030@gmail.com
 * @date 2023-04-14 00:13:42
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
