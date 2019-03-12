package pl.SpringLearning.printers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.SpringLearning.decorators.Decorator;
import pl.SpringLearning.decorators.MessageDecorator;
import pl.SpringLearning.producers.MessageProducer;
import pl.SpringLearning.producers.Producer;

@Component(value = "myMessagePrinter")
public class MessagePrinter {


    private MessageProducer producer;
    private MessageDecorator decorator;

    public MessagePrinter() {
    }

    @Autowired
    public MessagePrinter(@Producer(type = Producer.ProducerType.SIMPLE) MessageProducer messageProducer){
        this.producer = messageProducer;
    }


    public MessageDecorator getDecorator() {
        return decorator;
    }

    @Autowired(required = false)
    @Decorator(type = Decorator.DecoratorType.LOWER)
    public void setDecorator(MessageDecorator decorator) {
        this.decorator = decorator;
    }

    public MessageProducer getProducer() {
        return producer;
    }

    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }


    public void printMessage(){
        String message = producer.getMessage();
        message = decorator != null ? decorator.decorate(message) : message;
        System.out.println(message);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessagePrinter that = (MessagePrinter) o;

        return producer != null ? producer.equals(that.producer) : that.producer == null;
    }

    @Override
    public int hashCode() {
        return producer != null ? producer.hashCode() : 0;
    }

}
