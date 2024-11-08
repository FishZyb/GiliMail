package com.zyb.gulimall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.zyb.gulimall.order.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallOrderApplication {

  public static void main(String[] args) {
    SpringApplication.run(GulimallOrderApplication.class, args);
  }

}
