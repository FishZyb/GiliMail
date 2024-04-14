package com.zyb.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyb.common.utils.PageUtils;
import com.zyb.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author fishzyb@outlook.com
 * @email sunlightcs@gmail.com
 * @date 2024-04-14 21:59:30
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

