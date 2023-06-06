package com.xinxiangweb.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xinxiangweb.common.utils.PageUtils;
import com.xinxiangweb.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author xinruiliu
 * @email xinrui.liu.1030@gmail.com
 * @date 2023-04-14 00:05:17
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

