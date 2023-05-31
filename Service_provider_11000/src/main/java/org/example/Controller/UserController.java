package org.example.Controller;

import org.example.Entity.CommonResult;
import org.example.Entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
@RequestMapping("/user")
public class UserController {

    @Value("${msg}")
    private String msg;

    @GetMapping("/hello")
    public String Hello(){
        return "Hello world";
    }
    @GetMapping("/getUserById/{userId}")
    public CommonResult<User> getUserById(@PathVariable Integer userId){
        User u = new User(userId,"小明","123456");
        return new CommonResult<>(200,"suceess(11000) msg("+msg+")",u);

    }

//    @GetMapping("/getUserById/{userId}")
//    public CommonResult<User> getUserById(@PathVariable("userId") Integer userId){
//        return new CommonResult<>(200,"success(11000)",
//                new User(userId,"张三","123"));
//    }



}
