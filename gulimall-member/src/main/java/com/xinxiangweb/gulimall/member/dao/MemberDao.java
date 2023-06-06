package com.xinxiangweb.gulimall.member.dao;

import com.xinxiangweb.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xinruiliu
 * @email xinrui.liu.1030@gmail.com
 * @date 2023-04-14 00:05:17
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
