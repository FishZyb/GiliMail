package com.zyb.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zyb.gulimall.product.entity.BrandEntity;
import com.zyb.gulimall.product.service.BrandService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

  @Autowired
  BrandService brandService;

  @Test
  public void contextLoads() {
    BrandEntity brandEntity = new BrandEntity();
//    brandEntity.setName("华为");
//    brandService.save(brandEntity);
//    System.out.println("保存成功......");
//    brandEntity.setBrandId(1L);
//    brandEntity.setDescript("Test修改1");
//    brandService.updateById(brandEntity);
    //Test branch
    List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
    brand_id.forEach((item)->{
      System.out.println(item);
    });
  }


}
