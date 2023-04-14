package org.example.Feign;

import org.example.Entity.User;
import org.example.Entity.CommomResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("provider-server")
public interface UserFeignService {
    @GetMapping("/user/getUserById/{userId}")
    CommomResult<User> getUserById(@PathVariable("userId") Integer userId);

    @GetMapping("/user/hello")
    String Hello();

}
