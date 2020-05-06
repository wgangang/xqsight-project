package com.xqsight.gateway.filter;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/5/7
 */
public class XqSightFilterHandlerFactory {

    public static CurrentLimitFilter getCurrentLimitFilter() {
        CurrentLimitFilter currentLimitFilter = new CurrentLimitFilter();
        //黑名单处理
        BlackListFilter blackListFilter = new BlackListFilter();
        currentLimitFilter.setNextFilter(blackListFilter);

        //会话认证处理
        AuthFilter authFilter = new AuthFilter();
        authFilter.setNextFilter(blackListFilter);

        return currentLimitFilter;
    }
}
