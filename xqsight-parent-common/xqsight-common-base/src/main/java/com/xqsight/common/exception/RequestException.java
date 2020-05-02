package com.xqsight.common.exception;

import lombok.Getter;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/5/2
 */
public class RequestException extends RuntimeException {

    @Getter
    private String code;

    public RequestException(String code, String message) {
        super(message);
        this.code = code;
    }

    public RequestException(String code, String message, Throwable throwable) {
        super(message, throwable);
        this.code = code;
    }
}
