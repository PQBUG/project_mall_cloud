package com.imooc.practice.zuul.feign;

import com.imooc.practice.user.model.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserFeignClientHystrix implements UserFeignClient{
    @Override
    public Boolean checkAdminRole(User user) {
        return false;
    }
}
