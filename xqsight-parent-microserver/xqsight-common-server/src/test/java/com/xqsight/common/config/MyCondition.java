package com.xqsight.common.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Objects;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/5/6
 */
public class MyCondition implements Condition {

    /**
     *
     * @param context 获取当前的上下文
     * @param metadata 获取当前注解信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        String name = environment.getProperty("os.name");
        if(Objects.equals(name,"Mac OS X")){
            return true;
        }
        return false;
    }
}
