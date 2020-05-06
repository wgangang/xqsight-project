package com.xqsight.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/5/6
 */
@Service
public class OrderServiceTest {

    @Autowired
    //@Qualifier("firstOrderServiceImpl") 多个的时候添加名称说明
    private OrderService orderService;

    public void showName() {
        orderService.showName();
    }
}
