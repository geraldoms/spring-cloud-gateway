package com.springcloud.gatewayservice.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RequestHeaderFilter extends ZuulFilter {

    @Override
    public String filterType() {

        return "pre";
    }

    @Override
    public int filterOrder() {

        return 0;
    }

    @Override
    public boolean shouldFilter() {

        return true;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext context = RequestContext.getCurrentContext();
        context.addZuulRequestHeader("transactionId", UUID.randomUUID()
                                                          .toString());
        context.addZuulRequestHeader("x-zone", "America/Detroit");
        return null;
    }
}
