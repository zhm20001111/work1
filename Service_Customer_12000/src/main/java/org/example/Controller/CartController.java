package org.example.Controller;


import org.example.Entity.CommonResult;
import org.example.Entity.User;
import org.example.Feign.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
//@LoadBalancerClient(name="provider-server",configuration = CustomerLoadBalanceConfiguration.class)
public class CartController {

    @Autowired
    private UserFeignService userFeignService;

    @GetMapping("/hello")
    public String hello(){
        return userFeignService.Hello();
    }

    @GetMapping("/getUserById/{userId}")
    public CommonResult<User> addCart(@PathVariable("userId") Integer userId){
        return userFeignService.getUserById(userId);
    }



//    @GetMapping("/getUserById/{userId}")
//    @CircuitBreaker(name = "backendA",fallbackMethod = "fallback")
//    public CommomResult<User> addCart(@PathVariable Integer userId) throws InterruptedException{
//        return userFeignService.getUserById(userId);
//    }


//    public CommomResult<User> fallback(Integer userId,Throwable e){
//        e.printStackTrace();
//        System.out.println("fallback以及调用！");
//        CommomResult<User> result = new CommomResult<>(400,"当前用户不正常，请稍后再试！",null);
//        return result;
//    }


//    @Autowired
//    private DiscoveryClient discoveryClient;

//    @GetMapping("/getUserById/{userId}")
//    public CommomResult<User> getUserById(@PathVariable("userId") Integer userId){
//        List<ServiceInstance> instanceList = discoveryClient.getInstances("provider-server");
//        ServiceInstance instance = instanceList.get(0);
//        CommomResult result = restTemplate.getForObject("http://"+instance.getHost()+":"+
//                instance.getPort()+"/user/getUserById/"+userId, CommomResult.class);
//        return result;
//    }



//    @GetMapping("/hello")
//    public String hello(){
//        return restTemplate.getForObject(
//                "http://localhost:11000/user/hello",
//                 String.class
//        );
//    }

//    @GetMapping("/getUserById/{userId}")
//    public CommomResult<User> getUserById(@PathVariable Integer userId){
//        CommomResult<User> result = restTemplate.getForObject(
//                "http://localhost:11000/user/getUserById/"+userId, CommomResult.class);
//        return result;
//    }

//    @GetMapping("/getUserById/{userId}")
//    public CommomResult<User> getUserById(@PathVariable("userId") Integer userId){
//        return restTemplate.getForObject(
//                "http://localhost:11000/user/getUserById/"+userId,
//                CommomResult.class
//        );
//    }



}
