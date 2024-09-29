package com.zyb.gulimall.member.fegin;

import com.zyb.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 一只鱼zzz
 * @version 1.0
 * 声明式的远程调用接口
 */

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

  @RequestMapping("coupon/coupon/member/list")
  public R membercoupons();

}
