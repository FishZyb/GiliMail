package com.zyb.gulimall.member;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zyb.gulimall.member.dao")
@SpringBootApplication
public class GulimallMemberApplication {

  public static void main(String[] args) {
    SpringApplication.run(GulimallMemberApplication.class, args);
  }

}
