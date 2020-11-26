package com.ibs.gulimall.product.dao;

import com.ibs.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ibs
 * @email ivybsugarman@qq.com
 * @date 2020-11-25 22:11:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
