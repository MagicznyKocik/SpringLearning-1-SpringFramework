package pl.SpringLearning.producers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.SpringLearning.producers.MessageProducer;

@Component
@Producer(type = Producer.ProducerType.SIMPLE)
public class SimpleMessageProducer implements MessageProducer {


    public String getMessage() {
        return "Example message " + System.currentTimeMillis();
    }
}
