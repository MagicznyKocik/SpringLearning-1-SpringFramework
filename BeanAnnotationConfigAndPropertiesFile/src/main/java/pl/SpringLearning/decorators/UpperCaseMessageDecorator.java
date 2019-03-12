package pl.SpringLearning.decorators;

import org.springframework.stereotype.Component;

@Component
@Decorator(type = Decorator.DecoratorType.UPPER)
public class UpperCaseMessageDecorator implements MessageDecorator {

    @Override
    public String decorate(String message) {
        return message.toUpperCase();
    }
}
