package pl.SpringLearning.decorators;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.SpringLearning.decorators.MessageDecorator;

@Component
@Primary
public class UpperCaseMessageDecorator implements MessageDecorator {

    @Override
    public String decorate(String message) {
        return message.toUpperCase();
    }
}
