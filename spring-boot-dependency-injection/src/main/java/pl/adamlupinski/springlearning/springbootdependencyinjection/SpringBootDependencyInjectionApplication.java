package pl.adamlupinski.springlearning.springbootdependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.adamlupinski.springlearning.springbootdependencyinjection.beans.NamesRepository;

import java.util.List;

@SpringBootApplication
public class SpringBootDependencyInjectionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context  = SpringApplication.run(SpringBootDependencyInjectionApplication.class, args);
        NamesRepository namesRepository = context.getBean(NamesRepository.class);
        List<String> allNames = namesRepository.getAll();
        allNames.forEach(System.out::println);
        context.close();
    }

}
