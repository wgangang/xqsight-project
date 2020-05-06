package com.xqsight.common.config;

import com.xqsight.common.service.BeanDefinitionRegistrarService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/5/6
 */
public class MyDefinitionRegistrarService implements ImportBeanDefinitionRegistrar {

    /**
     * @param importingClassMetadata 注解的信息
     * @param registry
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //Spring中bean的信息都是 BeanDefinition 描述的 ，手动注册到IOC容器中
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(BeanDefinitionRegistrarService.class);
        registry.registerBeanDefinition("beanDefinitionRegistrarService", rootBeanDefinition);
        // SpringIOC 底层是通过beanDefinitionMap存放Bean的，线程安全的

        //FactoryBean  往IOC容器中注入对象
        //BeanFactory  从IOC容器中获取对象

    }
}
