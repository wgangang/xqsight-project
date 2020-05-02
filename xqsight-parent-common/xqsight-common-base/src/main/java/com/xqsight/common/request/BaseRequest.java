package com.xqsight.common.request;

import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/5/2
 */
@Data
public class BaseRequest {
    /**
     * 全局唯一序列
     */
    private String requestNo;

    private Long pageSize;

    private Long pageNo;

}
