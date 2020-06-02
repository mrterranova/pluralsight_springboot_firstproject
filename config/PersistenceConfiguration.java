package com.pluralsight.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
//    @Bean
//    public DataSource dataSource(){
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.url("");
//        System.out.println("My custom bean has been initialized and set");
//        return builder.build();
//    }
}
