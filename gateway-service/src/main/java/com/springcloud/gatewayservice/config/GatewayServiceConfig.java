package com.springcloud.gatewayservice.config;

import com.springcloud.gatewayservice.filter.RequestHeaderFilter;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayServiceConfig {

    public RequestHeaderFilter addRequestHeaderFilter() {

        return new RequestHeaderFilter();
    }
}
