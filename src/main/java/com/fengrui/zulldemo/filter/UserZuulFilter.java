package com.fengrui.zulldemo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * Description:
 *
 * @author wang zifeng
 * @Date Create on 2019-04-29 16:30
 * @since version1.0 Copyright 2018 Burcent All Rights Reserved.
 */
public class UserZuulFilter extends ZuulFilter {
    /**
     * 返回过滤类型，有：pre，route，post，error
     */
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    /**
     * 返回执行优先级，数字越小，优先级越高，越早执行
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 设置过滤条件
     */
    @Override
    public boolean shouldFilter() {
        return false;
    }

    /**
     * 具体的操作
     */
    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
