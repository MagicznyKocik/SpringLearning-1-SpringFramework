package pl.SpringLearning.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.Random;

@Configuration
@ComponentScan(basePackages = "pl.SpringLearning")
@PropertySource("classpath:applicationConfiguration.properties")
public class AppConfig {


    @Bean
    @Qualifier("randomNumber")
    public int getRandomNumber(){
        return new Random().nextInt();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcePlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
