package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;

/**
 * Created by associate on 12/2/16.
 */

@Configuration
public class InitPropsLoad {
        @Value("${spring.data2}")
        public String data2;
        @Value("${spring.data3}")
        public String data3;
        @Value("${spring.data4}")
        public String data4;
        @Value("${spring.data5}")
        public String data5;
}
