package com.Assignment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ernst on 2017/03/30.
 */
@Configuration
public class AppConfig {

    @Bean(name = "display")
    public Display getDisplay()
    {
        return new Display();
    }

    @Bean(name = "authentication")
    public Authentication getAuthentication()
    {
        return  new Authentication() ;
    }

    @Bean(name = "user")
    public User getUser(){return new User("Ernst", "1234");};

}
