package com.ibs.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ibs.common.utils.PageUtils;
import com.ibs.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author ibs
 * @email ivybsugarman@qq.com
 * @date 2020-11-25 22:11:11
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

