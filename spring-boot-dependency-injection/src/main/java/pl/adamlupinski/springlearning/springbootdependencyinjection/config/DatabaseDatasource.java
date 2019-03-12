package pl.adamlupinski.springlearning.springbootdependencyinjection.config;

import java.util.List;

public interface DatabaseDatasource {
    List<String> getDatabase();
}
