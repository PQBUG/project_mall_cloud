package com.imooc.practice.zuul.feign;

import com.imooc.practice.user.model.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述：     UserFeignClient
 */
@FeignClient(value = "cloud-mall-user", fallback =UserFeignClientHystrix.class)
@Primary
public interface UserFeignClient {

    @PostMapping("/checkAdminRole")
    public Boolean checkAdminRole(@RequestBody User user);
}
