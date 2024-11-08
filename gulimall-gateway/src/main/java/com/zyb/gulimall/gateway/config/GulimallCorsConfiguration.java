package com.zyb.gulimall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @author 一只鱼zzz
 * @version 1.0
 * 配置类，解决跨域问题
 */
@Configuration
public class GulimallCorsConfiguration {

  @Bean
  public CorsWebFilter corsWebFilter(){
    UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
    CorsConfiguration corsConfiguration = new CorsConfiguration();
    //1、配置跨域
    corsConfiguration.addAllowedHeader("*");
    corsConfiguration.addAllowedMethod("*");
    corsConfiguration.addAllowedOrigin("*");
    corsConfiguration.setAllowCredentials(true);

    urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",corsConfiguration);
    return new CorsWebFilter(urlBasedCorsConfigurationSource);
  }

}
