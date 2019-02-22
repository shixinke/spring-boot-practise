package com.github.shixinke.practise.sentinel.configuration;

import com.github.shixinke.practise.common.inteceptor.RequestArgumentResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shixinke
 * @version 1.0
 * @Description
 * @Date 19-2-22 下午4:14
 */
@Configuration
public class InteceptorConfiguration implements WebMvcConfigurer {

    @Resource
    private RequestArgumentResolver requestArgumentResolver;


    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(requestArgumentResolver);
    }

    @Bean
    public RequestArgumentResolver requestArgumentResolver() {
        return new RequestArgumentResolver();
    }

}
