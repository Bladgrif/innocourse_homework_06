package university.innopolis.learn.task_01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Copier {
    public static void copyTextFile(String pathIn, String pathOut) throws IOException {
        List<String> content = Files.readAllLines(Path.of(pathIn));
        Files.write(Path.of(pathOut), content);
    }
}
