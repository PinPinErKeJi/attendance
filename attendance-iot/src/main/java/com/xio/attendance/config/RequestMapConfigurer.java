package com.xio.attendance.config;

import com.xio.attendance.handle.RequestMapArgumentResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class RequestMapConfigurer implements WebMvcConfigurer {

    @Autowired
    private RequestMapArgumentResolver requestMapArgumentResolver;

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(requestMapArgumentResolver);
    }
}
