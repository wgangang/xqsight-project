package com.xqsight.common.config;

import com.xqsight.account.service.UserService;
import com.xqsight.common.service.ImportService;
import org.springframework.context.annotation.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/5/6
 */
@Configuration
/**
 * 将外部的jar注入到springIoc容器中 @Import等同于@Bean
 * @Import 注册的bean对象的ID为当前类的全路径，多用于倒入第三方jar包
 */
@Import({ImportService.class, MyImportSelector.class, MyDefinitionRegistrarService.class})
/**
 * 自定义开启支付类
 */
@EnablePayService
@ComponentScan({"com.xqsight.common.service"})
public class MyConfig {

    @Bean
    @Conditional(MyCondition.class)
    public UserService userService() {
        return new UserService();
    }

    @Bean
    public MyFactoryBean myFactoryBean() {
        return new MyFactoryBean();
    }
}
