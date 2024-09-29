package com.zyb.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 一、使用nacos作为配置中心统一管理配置
 * 1、common引入依赖
 * 2、当前服务创建bootstrap配置文件
 * 3、给配置中心默认添加一个当前服务名.properties默认规则
 * 4、动态获取配置使用RefreshScope注解和Value获取配置值
 * 二、细节
 * 1、命名空间：配置隔离
 *    默认为public；默认新增的所有配置都在public空间。
 *    我们可以配置开发、测试、生产空间来做环境隔离。在bootstrap配置文件中进行空间的配置
 * 2、配置集：所有配置的集合
 * 3、配置集ID：类似文件名
 * 4、配置分组：默认所有的配置集都属于DEFAULT_GROUP,我们可以将配置集放在不同的分组
 */
@MapperScan("com.zyb.gulimall.coupon.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallCouponApplication {

  public static void main(String[] args) {
    SpringApplication.run(GulimallCouponApplication.class, args);
  }

}
