package pl.SpringLearning.beans;

public class SimpleMessageProducer implements MessageProducer {


    public String getMessage() {
        return "Example message " + System.currentTimeMillis();
    }
}
