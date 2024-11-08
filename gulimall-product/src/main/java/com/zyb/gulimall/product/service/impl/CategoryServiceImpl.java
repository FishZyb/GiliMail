package com.zyb.gulimall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyb.common.utils.PageUtils;
import com.zyb.common.utils.Query;

import com.zyb.gulimall.product.dao.CategoryDao;
import com.zyb.gulimall.product.entity.CategoryEntity;
import com.zyb.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<CategoryEntity> page = this.page(
      new Query<CategoryEntity>().getPage(params),
      new QueryWrapper<CategoryEntity>()
    );

    return new PageUtils(page);
  }

  @Override
  public List<CategoryEntity> listWithTree() {
    //1、查出所有分类
    // baseMapper就是CategoryDao
    List<CategoryEntity> entities = baseMapper.selectList(null);

    //2、组装成父子的树形结构
    //2.1 找到所有的一级分类
    List<CategoryEntity> level1Menus = entities.stream().filter((categoryEntity) -> {
      return categoryEntity.getParentCid() == 0;
    }).map((menu) -> {
      menu.setChildren(getChildrens(menu, entities));
      return menu;
    }).sorted((menu1, menu2) -> {
      return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
    }).collect(Collectors.toList());

    return level1Menus;
  }

  /**
   * 递归查找所有菜单的子菜单
   *
   * @param root 当前菜单
   * @param all  所有菜单
   * @return 找当前菜单的所有子菜单
   */
  private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
    List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
      return categoryEntity.getParentCid() == root.getCatId();
    }).map(categoryEntity -> {
      //1、找子菜单
      categoryEntity.setChildren(getChildrens(categoryEntity, all));
      return categoryEntity;
    }).sorted((menu1, menu2) -> {
      //2、菜单排序
      return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
    }).collect(Collectors.toList());

    return children;
  }

  /**
   * 三级分类模块删除功能实现
   * @param asList
   */
  @Override
  public void reMoveMenuByIds(List<Long> asList) {
    //TODO 1、检查当前删除的菜单，是否被别的菜单引用


    baseMapper.deleteBatchIds(asList);
  }


}
