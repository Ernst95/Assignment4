package com.Assignment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 3/23/16.
 */
@Configuration
public class AppConfig {

    @Bean(name="text")
    public TextInterface getText()
    {
        return new Text();
    }

    @Bean(name ="music")
    public MusicInterface getPlay()
    {
        return new Music();
    }

    @Bean (name ="photo")
    public PhotoInterface getPhoto()
    {
        return new Photo();
    }

    @Bean (name="call")
    public CallInterface getCall()
    {
        return new Call();
    }
}
