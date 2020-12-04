package com.ibs.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ibs.common.utils.PageUtils;
import com.ibs.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author ibs
 * @email ivybsugarman@qq.com
 * @date 2020-11-25 22:11:11
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

