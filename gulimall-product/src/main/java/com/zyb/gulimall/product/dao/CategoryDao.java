package com.zyb.gulimall.product.dao;

import com.zyb.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author fishzyb@outlook.com
 * @email sunlightcs@gmail.com
 * @date 2024-04-13 22:10:46
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
