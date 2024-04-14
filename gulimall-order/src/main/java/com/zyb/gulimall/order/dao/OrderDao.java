package com.zyb.gulimall.order.dao;

import com.zyb.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author fishzyb@outlook.com
 * @email sunlightcs@gmail.com
 * @date 2024-04-14 22:58:15
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
