package pl.SpringLearning.producers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Producer(type = Producer.ProducerType.SIMPLE)
public class SimpleMessageProducer implements MessageProducer {

    @Autowired
    @Qualifier("randomNumber")
    private int random;


    public String getMessage() {
        return "Example message " + this + " : " + random;
    }
}
