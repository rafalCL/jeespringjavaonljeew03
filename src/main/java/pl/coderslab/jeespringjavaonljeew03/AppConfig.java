package pl.coderslab.jeespringjavaonljeew03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.jeespringjavaonljeew03.beans.HelloWorld;

@Configuration
public class AppConfig {
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
