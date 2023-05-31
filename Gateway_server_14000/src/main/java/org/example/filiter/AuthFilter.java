package org.example.filiter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

//这是全局
@Component
//用@Component将过滤器放入springCloud容器中
public class AuthFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String token = exchange.getRequest().getQueryParams().getFirst("token");
        if(token==null){
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            //请求直接结束了，应为它是不合理的
            return exchange.getResponse().setComplete();
        }
        //继续执行过滤器链中的下一个资源
        return chain.filter(exchange);
    }
}
