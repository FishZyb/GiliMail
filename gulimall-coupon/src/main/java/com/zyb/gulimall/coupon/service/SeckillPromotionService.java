package com.zyb.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyb.common.utils.PageUtils;
import com.zyb.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author fishzyb@outlook.com
 * @email sunlightcs@gmail.com
 * @date 2024-04-14 21:59:30
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

