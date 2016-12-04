package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


/**
 * Created by associate on 12/2/16.
 */

@Configuration
public class InitProps {

        @Value("${spring.data2}")
        public String SpringData2;

        @Value("${spring.data3}")
        public String SpringData3;
}
