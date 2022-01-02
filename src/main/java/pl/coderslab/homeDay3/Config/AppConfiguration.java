package pl.coderslab.homeDay3.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.homeDay3.SimpleCustomerLogger;

@Configuration
public class AppConfiguration {


    @Bean
    public SimpleCustomerLogger logger (){return new SimpleCustomerLogger();}
}
