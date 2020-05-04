package com.xqsight.api.account.openfeign;

import com.xqsight.common.response.ResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/4/30
 */
@FeignClient(name = "common-service")
@RequestMapping("/user")
public interface UserFeign {

    @GetMapping("/test")
    ResponseData test();

}
