package org.example.config;


import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/// use ComponentScan when beans is not declared / it is auto manage by spring
@Configuration
@ComponentScan("org.example")
public class AppConfig {
//
//    //    @Bean
////    @Bean(name = "desktop1")
//    @Bean(name = {"desktop1", "com"})
//    @Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
}
