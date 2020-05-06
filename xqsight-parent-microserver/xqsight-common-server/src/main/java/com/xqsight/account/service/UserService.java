package com.xqsight.account.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/4/30
 */

/**
 * 默认是单例的
 */
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
/**
 * 不添加此注解是 饿汉式的
 */
@Lazy
public class UserService {
}
