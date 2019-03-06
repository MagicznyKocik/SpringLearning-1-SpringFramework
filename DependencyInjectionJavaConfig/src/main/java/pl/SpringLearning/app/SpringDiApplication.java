package pl.SpringLearning.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.SpringLearning.beans.MessagePrinter;

public class SpringDiApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        MessagePrinter printer = context.getBean("myMessagePrinter", MessagePrinter.class);
        printer.printMessage();;
        context.close();

    }
}
