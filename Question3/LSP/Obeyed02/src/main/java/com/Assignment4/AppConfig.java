package com.Assignment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 3/21/16.
 */
@Configuration
public class AppConfig {

    @Bean(name="rectangle")
    public Rectangle getRectangleDetails()
    {
        return new Rectangle(4.0,2.0);
    }

    @Bean(name="square")
    public Square getSquareDetails()
    {
        return new Square(10.0);
    }
}

