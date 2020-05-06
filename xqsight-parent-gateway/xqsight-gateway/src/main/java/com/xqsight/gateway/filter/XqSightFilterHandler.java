package com.xqsight.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;

import java.util.Objects;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/5/7
 */
public abstract class XqSightFilterHandler implements GlobalFilter {

    private GlobalFilter nextFilter;

    /**
     * 设置下一个filter
     *
     * @param filter
     */
    public void setNextFilter(GlobalFilter filter) {
        this.nextFilter = filter;
    }

    /**
     * 执行下一个过滤器
     *
     * @param exchange
     * @param chain
     */
    public void executeNextFilter(ServerWebExchange exchange, GatewayFilterChain chain) {
        if (Objects.nonNull(nextFilter)) {
            nextFilter.filter(exchange, chain);
        }
    }


}
