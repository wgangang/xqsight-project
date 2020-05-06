package com.xqsight.common.service.impl;

import com.xqsight.common.service.OrderService;
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
public class SecondOrderServiceImpl implements OrderService {

    @Override
    public void showName() {
        System.out.println("第二个");
    }
}
