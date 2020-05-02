package com.xqsight.gateway.service;

import com.xqsight.api.account.client.UserInfoClient;
import com.xqsight.common.response.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/5/2
 */
@RestController
public class UserTestController {

    @Autowired
    private UserInfoClient userInfoClient;

    @GetMapping("/test")
    public ResponseData test() {
        return ResponseData.SUCCESS(userInfoClient.test());
    }

}
