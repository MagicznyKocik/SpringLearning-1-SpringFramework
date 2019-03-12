package pl.SpringLearning.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.SpringLearning.config.AppConfig;
import pl.SpringLearning.printers.MessagePrinter;

public class SpringDiApplication {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessagePrinter printer = context.getBean("myMessagePrinter", MessagePrinter.class);
        printer.printMessage();
        context.close();

    }
}
