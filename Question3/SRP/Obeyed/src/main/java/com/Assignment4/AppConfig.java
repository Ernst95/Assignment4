package com.Assignment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 3/19/16.
 */
@Configuration
public class AppConfig {
    @Bean(name="square")
    public Area getDetails()
    {
        return new Area(10.0);
    }

}
