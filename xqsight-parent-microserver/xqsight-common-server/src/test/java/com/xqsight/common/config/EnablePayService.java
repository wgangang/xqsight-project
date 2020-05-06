package com.xqsight.common.config;

import com.xqsight.common.service.PayService;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/5/6
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(PayService.class)
public @interface EnablePayService {

    // 只要启动时候加入该注解，将会该实体类加载到SpringIOC容器中
}
