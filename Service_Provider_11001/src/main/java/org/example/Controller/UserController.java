package org.example.Controller;

import org.example.Entity.CommomResult;
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
    public CommomResult<User> getUserById(@PathVariable("userId") Integer userId){
        return new CommomResult<>(200,"success(11001)",new User(userId,"张三","123"));
    }

}
