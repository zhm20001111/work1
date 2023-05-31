package org.example.Controller;


import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.example.Entity.CommonResult;
import org.example.Entity.User;
import org.example.Feign.UserFeignService;
import org.example.Im.CustomerLoadBalanceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

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


      @GetMapping("/addCart/{userId}")
      public CommonResult<User> addCart(@PathVariable Integer userId){
        CommonResult<User> list =  userFeignService.getUserById(userId);
        return  list;
      }
//      public CommonResult<User> fallback(Integer userId,Throwable e){
//        e.printStackTrace();
//        System.out.println("fallback已经调用！");
//        CommonResult<User> result = new CommonResult<>(400,"当前用户不正常，请稍后再试！",null);
//        return result;
//      }

//     @GetMapping("/addCart/{userId}")
//     @CircuitBreaker(name = "backendB",fallbackMethod = "fallBack")
////     @Bulkhead(name="bulkheadA",fallbackMethod = "fallBack",type=Bulkhead.Type.SEMAPHORE)
////     @RateLimiter(name="rate-limiterA",fallbackMethod = "fallBack")
//     public CompletableFuture<User> addCart(@PathVariable("userId") Integer userId) throws InterruptedException{
//         System.out.println("进入方法");
////        Thread.sleep(1000L);
//         CompletableFuture<User> result = CompletableFuture.supplyAsync(()->{
//          return userFeignService.getUserById(userId).getResult();
//    });
//          System.out.println("离开方法");
//          return result;
//    }
//
//    public CompletableFuture<User> fallBack(Integer userId,Throwable e){
//        e.printStackTrace();
//        System.out.println("fallBack已经调用啦！");
//        CompletableFuture<User> result = CompletableFuture.supplyAsync(()->{
//            return new CommonResult<>(400,"当前用户服务不正常，请稍后再试",new User()).getResult();
//        });
//        return result;
//    }






}
