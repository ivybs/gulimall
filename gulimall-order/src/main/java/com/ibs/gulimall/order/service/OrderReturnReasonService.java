package com.ibs.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ibs.common.utils.PageUtils;
import com.ibs.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author ibs
 * @email ivybsugarman@qq.com
 * @date 2020-11-26 00:11:43
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

