package com.xqsight.account.controller;

import com.xqsight.api.account.openfeign.UserFeign;
import com.xqsight.common.response.ResponseData;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/4/30
 */
@RestController
public class UserController implements UserFeign {

    @Override
    public ResponseData test() {
        return ResponseData.SUCCESS("SUCCESS");
    }
}
