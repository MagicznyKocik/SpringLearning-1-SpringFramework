package pl.SpringLearning.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.SpringLearning.bean.MessagePrinter;

@Configuration
@ComponentScan(basePackages = "pl.SpringLearning")
public class SpringDiApplication {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringDiApplication.class);

        MessagePrinter bean1 = context.getBean(MessagePrinter.class);
        bean1.printMessage();
        MessagePrinter bean2 = context.getBean(MessagePrinter.class);
        bean2.printMessage();

        context.close();
    }
}
