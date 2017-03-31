package com.Assgnment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ernst on 2017/03/30.
 */
@Configuration
public class AppConfig {

    @Bean(name="pidgeon")
    public Pidgeon getBirdMovement()
    {
        return  new Pidgeon() ;
    }

    @Bean(name="peacock")
    public Peacock getOstrich()
    {
        return new Peacock();
    }
}
