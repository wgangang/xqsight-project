package com.xqsight.common.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/5/6
 */
@Configuration
public class ConfigurationServiceTest {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ConfigurationService configurationService() {
        return new ConfigurationService();
    }

    @Bean
    public ConfigurationServiceFirst configurationServiceFirst() {
        ConfigurationService configurationService1 = configurationService();
        ConfigurationService configurationService2 = configurationService();
        System.out.println("configurationService1=======" + (configurationService1 == configurationService2));
        return new ConfigurationServiceFirst();
    }
}
