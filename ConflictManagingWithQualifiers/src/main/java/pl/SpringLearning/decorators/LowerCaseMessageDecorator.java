package pl.SpringLearning.decorators;

import org.springframework.stereotype.Component;

@Component
@Decorator(type = Decorator.DecoratorType.LOWER)
public class LowerCaseMessageDecorator implements MessageDecorator{

    @Override
    public String decorate(String message) {
        return message.toLowerCase();
    }
}
