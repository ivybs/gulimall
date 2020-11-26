package com.ibs.gulimall.coupon.dao;

import com.ibs.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ibs
 * @email ivybsugarman@qq.com
 * @date 2020-11-25 23:59:15
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
