package com.ibs.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ibs.common.utils.PageUtils;
import com.ibs.gulimall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author ibs
 * @email ivybsugarman@qq.com
 * @date 2020-11-26 00:11:43
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

