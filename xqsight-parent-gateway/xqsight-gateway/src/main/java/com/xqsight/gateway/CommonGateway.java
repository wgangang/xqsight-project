package com.xqsight.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/5/2
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.xqsight.**.service", "com.xqsight.**.client"})
@EnableFeignClients(basePackages = {"com.xqsight.**.openfeign"})
public class CommonGateway {

    public static void main(String[] args) {
        SpringApplication.run(CommonGateway.class, args);
    }
}
