package com.zyb.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyb.common.utils.PageUtils;
import com.zyb.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author fishzyb@outlook.com
 * @email sunlightcs@gmail.com
 * @date 2024-04-14 21:59:30
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

