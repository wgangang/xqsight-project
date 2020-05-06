package com.xqsight.common.config;

import com.xqsight.common.service.FactoryBeanService;
import org.springframework.beans.factory.FactoryBean;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/5/6
 */
public class MyFactoryBean implements FactoryBean {
    //往IOC容器中注入对象
    @Override
    public FactoryBeanService getObject() throws Exception {
        return new FactoryBeanService();
    }

    @Override
    public Class<?> getObjectType() {
        return FactoryBeanService.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
