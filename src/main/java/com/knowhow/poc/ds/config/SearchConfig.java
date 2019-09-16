package com.knowhow.poc.ds.config;

import com.knowhow.poc.ds.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SearchConfig {

    @Autowired
    private ApplicationContext context;

    @Bean
    @RefreshScope
    public SearchService searchServiceType(@Value("${address-type}") String qualifier) {
        return (SearchService) context.getBean(qualifier);
    }

}
