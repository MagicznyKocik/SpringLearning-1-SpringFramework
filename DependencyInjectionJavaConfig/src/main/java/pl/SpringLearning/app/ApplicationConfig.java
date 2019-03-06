package pl.SpringLearning.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.SpringLearning.beans.MessagePrinter;
import pl.SpringLearning.beans.MessageProducer;
import pl.SpringLearning.beans.SimpleMessageProducer;

@Configuration
public class ApplicationConfig {

    @Bean(name = "myMessagePrinter")
    public MessagePrinter getPrinter(){
        MessageProducer producer = new SimpleMessageProducer();
        return new MessagePrinter(producer);
    }
}
