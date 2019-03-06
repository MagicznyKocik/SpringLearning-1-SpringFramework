package pl.SpringLearning.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.SpringLearning.beans.FileMessageProducer;
import pl.SpringLearning.beans.MessagePrinter;
import pl.SpringLearning.beans.MessageProducer;
import pl.SpringLearning.beans.SimpleMessageProducer;

public class SpringDiApplication {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
        MessagePrinter printer = context.getBean("messagePrinter", MessagePrinter.class);
        printer.printMessage();;
        context.close();

    }
}
