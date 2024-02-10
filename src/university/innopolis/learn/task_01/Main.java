package university.innopolis.learn.task_01;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Copier.copyTextFile("src/university/innopolis/learn/data/Example.txt", "src/university/innopolis/learn/data/ExampleCopy.");
        } catch (IOException e) {
            System.out.println("Что-то пошло не так");
        }
    }
}
