package com.xinxiangweb.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xinxiangweb.common.utils.PageUtils;
import com.xinxiangweb.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author xinruiliu
 * @email xinrui.liu.1030@gmail.com
 * @date 2023-04-14 00:05:17
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

