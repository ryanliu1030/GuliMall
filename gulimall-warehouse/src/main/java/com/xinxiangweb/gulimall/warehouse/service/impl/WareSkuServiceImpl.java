package com.xinxiangweb.gulimall.warehouse.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xinxiangweb.common.utils.PageUtils;
import com.xinxiangweb.common.utils.Query;

import com.xinxiangweb.gulimall.warehouse.dao.WareSkuDao;
import com.xinxiangweb.gulimall.warehouse.entity.WareSkuEntity;
import com.xinxiangweb.gulimall.warehouse.service.WareSkuService;


@Service("wareSkuService")
public class WareSkuServiceImpl extends ServiceImpl<WareSkuDao, WareSkuEntity> implements WareSkuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareSkuEntity> page = this.page(
                new Query<WareSkuEntity>().getPage(params),
                new QueryWrapper<WareSkuEntity>()
        );

        return new PageUtils(page);
    }

}