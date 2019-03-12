package pl.SpringLearning.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
@ComponentScan(basePackages = "pl.SpringLearning")
public class AppConfig {

    @Bean
    @Qualifier("messageFile")
    public String configFileName(){
        return "message.txt";
    }

    @Bean
    @Qualifier("randomNumber")
    public int getRandomNumber(){
        return new Random().nextInt();
    }
}
