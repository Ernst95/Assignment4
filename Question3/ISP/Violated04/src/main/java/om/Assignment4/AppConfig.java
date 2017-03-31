package om.Assignment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 3/23/16.
 */
@Configuration
public class AppConfig {

    @Bean(name = "phone")
    public PhoneServices getService()
    {
        return new Phone();
    }
}
