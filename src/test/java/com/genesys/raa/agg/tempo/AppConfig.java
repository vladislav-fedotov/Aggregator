package com.genesys.raa.agg.tempo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;

@Configuration
public class AppConfig {

    @Bean
    public Connection getConnection() {
        return null;
    }

}