package pl.SpringLearning.beans;

import org.springframework.stereotype.Component;

@Component
public class SimpleMessageProducer implements MessageProducer {


    public String getMessage() {
        return "Example message " + System.currentTimeMillis();
    }
}
