package com.yitian.config;

import com.yitian.model.Proper;
import com.yitian.service.TestService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(Proper.class)
@ConditionalOnWebApplication
public class HelloAutoConfigtion {

    private final Proper proper;

    public HelloAutoConfigtion(Proper proper) {
        this.proper = proper;
    }

    @Bean
    @ConditionalOnMissingBean
    public TestService testService() {
        return new TestService();
    }
}
