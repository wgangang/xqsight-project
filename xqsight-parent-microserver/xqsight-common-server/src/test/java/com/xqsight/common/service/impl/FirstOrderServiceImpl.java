package com.xqsight.common.service.impl;

import com.xqsight.common.service.OrderService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/5/6
 */
@Component
/**
 * 默认优先级
 */
@Primary
public class FirstOrderServiceImpl implements OrderService {

    @Override
    public void showName() {
        System.out.println("第一个");
    }
}
