package pl.coderslab.jeespringjavaonljeew03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.coderslab.jeespringjavaonljeew03.beans.HelloWorld;
import pl.coderslab.jeespringjavaonljeew03.beans.ScopePrototype;
import pl.coderslab.jeespringjavaonljeew03.beans.ScopeSingleton;

@Configuration
public class AppConfig {
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }

    @Bean
    public ScopeSingleton scopeSingleton(){
        return new ScopeSingleton();
    }

    @Bean
    @Scope("prototype")
    public ScopePrototype scopePrototype(){
        return new ScopePrototype();
    }
}
