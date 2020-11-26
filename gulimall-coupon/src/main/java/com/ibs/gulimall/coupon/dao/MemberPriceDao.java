package com.ibs.gulimall.coupon.dao;

import com.ibs.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author ibs
 * @email ivybsugarman@qq.com
 * @date 2020-11-25 23:59:16
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
