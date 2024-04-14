package com.zyb.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyb.common.utils.PageUtils;
import com.zyb.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author fishzyb@outlook.com
 * @email sunlightcs@gmail.com
 * @date 2024-04-14 21:59:30
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

