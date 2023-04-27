package org.example.Controller;

import org.example.Entity.CommonResult;
import org.example.Entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello world";
    }

    @GetMapping("/getUserById/{userId}")
    public CommonResult<User> getUserById(@PathVariable("userId") Integer userId){
        return new CommonResult<>(200,"success(11001)",new User(userId,"张三","123"));
    }

}
