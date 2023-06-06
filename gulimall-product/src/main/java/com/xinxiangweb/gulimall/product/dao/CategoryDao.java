package com.xinxiangweb.gulimall.product.dao;

import com.xinxiangweb.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xinruiliu
 * @email xinrui.liu.1030@gmail.com
 * @date 2023-04-13 01:18:23
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
