package com.xinxiangweb.gulimall.warehouse.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xinxiangweb.common.utils.PageUtils;
import com.xinxiangweb.common.utils.Query;

import com.xinxiangweb.gulimall.warehouse.dao.PurchaseDao;
import com.xinxiangweb.gulimall.warehouse.entity.PurchaseEntity;
import com.xinxiangweb.gulimall.warehouse.service.PurchaseService;


@Service("purchaseService")
public class PurchaseServiceImpl extends ServiceImpl<PurchaseDao, PurchaseEntity> implements PurchaseService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PurchaseEntity> page = this.page(
                new Query<PurchaseEntity>().getPage(params),
                new QueryWrapper<PurchaseEntity>()
        );

        return new PageUtils(page);
    }

}