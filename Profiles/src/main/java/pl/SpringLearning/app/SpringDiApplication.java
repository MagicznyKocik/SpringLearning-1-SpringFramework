package pl.SpringLearning.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.SpringLearning.beans.NamesRepository;

import java.util.List;

@Configuration
@ComponentScan(basePackages = "pl.SpringLearning")
public class SpringDiApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringDiApplication.class);

        NamesRepository namesRepository = context.getBean(NamesRepository.class);
        List<String> allNames = namesRepository.getAll();
        allNames.forEach(System.out::println);
        context.close();
    }



}
