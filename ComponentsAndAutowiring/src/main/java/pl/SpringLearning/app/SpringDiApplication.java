package pl.SpringLearning.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.SpringLearning.beans.MessagePrinter;
@Configuration
//@ComponentScan(basePackageClasses = MessagePrinter.class)
@ComponentScan(basePackages = "pl.SpringLearning.beans")
public class SpringDiApplication {

//    because ApplicationConfig.class with @ComponentScan  annotation would be empty then we could add @ComponentScan to
//    our Main class and delete ApplicationConfig

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringDiApplication.class);
        MessagePrinter printer = context.getBean("myMessagePrinter", MessagePrinter.class);
        printer.printMessage();;
        context.close();

    }
}
