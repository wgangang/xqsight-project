package com.xqsight.common.response;

import com.xqsight.common.constants.XqConstants;
import com.xqsight.common.exception.RequestException;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.Objects;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/5/2
 */
@Setter
@Getter
@ToString
@Accessors(chain = true)
public class ResponseData<T> {

    /**
     * 状态码：1成功，其他为失败
     **/
    private String code = XqConstants.SUCCESS_CODE;

    /**
     * 成功为success，其他为失败原因
     **/
    private String message;

    /**
     * 数据结果集
     **/
    private T data;

    public static ResponseData SUCCESS() {
        return new ResponseData().setMessage(XqConstants.SUCCESS_MESSAGE);
    }

    public static ResponseData SUCCESS(Object data) {
        return new ResponseData().setMessage(XqConstants.SUCCESS_MESSAGE).setData(data);
    }

    public static ResponseData FAILURE(String code, String message) {
        return new ResponseData().setData(code).setMessage(message);
    }

    public Boolean isSuccess() {
        return Objects.equals(this.code, XqConstants.SUCCESS_CODE);
    }

    public T isSuccessGet() {
        if (Objects.equals(this.code, XqConstants.SUCCESS_CODE)) {
            return this.data;
        }
        throw new RequestException(this.code, this.message);
    }


    public T getData() {
        return this.data;
    }
}
