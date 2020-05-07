package com.xqsight.common;

import com.xqsight.account.service.UserService;
import com.xqsight.common.config.MyConfig;
import com.xqsight.common.service.ConfigurationService;
import com.xqsight.common.service.FactoryBeanService;
import com.xqsight.common.service.OrderServiceTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/5/6
 */
public class SpringTest {

    private static AnnotationConfigApplicationContext annotationConfigApplicationContext;

    public static void main(String[] args) {
        //ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("test.xml");
        annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        //new AnnotationConfigApplicationContext("");
        System.out.println("=======================");
        UserService userService = annotationConfigApplicationContext.getBean("userService", UserService.class);
        System.out.println(userService);

        FactoryBeanService factoryBeanService = annotationConfigApplicationContext.getBean("myFactoryBean", FactoryBeanService.class);

        System.out.println(factoryBeanService);

        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();

        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
        //spring中默认对象是单例的
        /**
         * bean初始化的两种 1、调用的时候创建 2、配置文件加载的时候创建（默认） 可以通过@Lazy设置
         */

        /**
         * springIoc 容器中注入对象
         * @Bean注解 往springIoc中注入bean对象 外部方式
         * @Import注解 往springIoc中注入bean对象 外部方式
         * @Service、@Repository 注入对象，更好的区分业务场景 底层都是@Component注解
         */

        OrderServiceTest orderService = annotationConfigApplicationContext.getBean("orderServiceTest", OrderServiceTest.class);
        orderService.showName();
        ConfigurationService configurationService1 = annotationConfigApplicationContext.getBean("configurationService", ConfigurationService.class);
        ConfigurationService configurationService12 = annotationConfigApplicationContext.getBean("configurationService", ConfigurationService.class);
        System.out.println(configurationService1 == configurationService12);
        /**
         * BeanFactory and ApplicationContext Spring生命周期最核心的类
         * ApplicationContext 是对BeanFactory 的扩展
         *
         */


    }
}
