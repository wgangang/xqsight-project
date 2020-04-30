package com.xqsight.api.account.client.impl;

import com.xqsight.api.account.openfeign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/4/30
 */
@Component
public class UserClientImpl {

    @Autowired
    private UserFeign userFeign;

}
