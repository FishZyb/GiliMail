package com.zyb.gulimall.member;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 微服务远程调用其它服务的步骤：
 * 1、引入OpenFeign
 * 2、编写一个接口，告诉SpringCloud，该接口需要调用远程服务;声明接口的每一个方法都是调用哪个远程服务的哪个远程请求
 * 3、开启远程调用功能
 */
@MapperScan("com.zyb.gulimall.member.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.zyb.gulimall.member.fegin")
public class GulimallMemberApplication {

  public static void main(String[] args) {
    SpringApplication.run(GulimallMemberApplication.class, args);
  }

}
