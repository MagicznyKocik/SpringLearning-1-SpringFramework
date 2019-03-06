package pl.SpringLearning.beans;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileMessageProducer implements MessageProducer {
    public String getMessage() {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("DependencyInjection/message.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String result = "";
        if (lines != null) {
            result = lines.stream().reduce(result, (a, b) -> a + b);
        }
        return result;
    }
}
