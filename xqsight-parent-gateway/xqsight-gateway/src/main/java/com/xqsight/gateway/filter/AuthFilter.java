package com.xqsight.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 会话认证拦截器
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/5/7
 */
public class AuthFilter extends XqSightFilterHandler {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        chain.filter(exchange);
        return null;
    }
}
