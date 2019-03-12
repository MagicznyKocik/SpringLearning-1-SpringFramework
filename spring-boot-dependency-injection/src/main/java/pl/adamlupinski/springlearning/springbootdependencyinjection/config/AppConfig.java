package pl.adamlupinski.springlearning.springbootdependencyinjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import pl.adamlupinski.springlearning.springbootdependencyinjection.profiles.DevProfile;
import pl.adamlupinski.springlearning.springbootdependencyinjection.profiles.ProdProfile;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    @DevProfile
    public DatabaseDatasource getH2Datasource(){
        return(()-> Arrays.asList("Matuesz", "Emiliajanna", "Amum"));
    }

    @Bean
    @ProdProfile
    public DatabaseDatasource getMysqlDatasource() {
        return new DatabaseDatasource() {
            @Override
            public List<String> getDatabase() {
                try {
                    Path filePath = new File(getClass().getResource("/data.txt").toURI()).toPath();
                    List<String> allLines = Files.readAllLines(filePath);
                    return allLines;
                } catch (IOException | URISyntaxException e) {
                    e.printStackTrace();
                }
                return new ArrayList<>();
            }
        };
    }

    @Bean
    @Profile("default")
    public DatabaseDatasource getDefaultDatasource(){
        return (()-> Arrays.asList("Kasia", "Masia", "Basia"));
    }

}
