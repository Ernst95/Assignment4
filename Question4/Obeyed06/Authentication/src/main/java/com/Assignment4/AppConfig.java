package com.Assignment4;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ernst on 2017/03/30.
 */
@Configuration
public class AppConfig {

    @Bean(name = "authentication")
    public Authentication getAuthentication()
    {
        return  new Authentication() ;
    }

}
