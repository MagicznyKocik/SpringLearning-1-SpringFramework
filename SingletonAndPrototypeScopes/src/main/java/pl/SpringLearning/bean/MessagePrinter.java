package pl.SpringLearning.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MessagePrinter {

    @Autowired
    private MessageProducer producer;

    public void printMessage(){
        System.out.println(producer.getNumber());
    }

}
