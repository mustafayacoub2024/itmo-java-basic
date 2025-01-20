package lab9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void fileWriter(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(content);
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при записи в файл: " + e.getMessage(), e);
        }
    }

    public static void main(String[] args) {
        fileWriter("src/lab9/File2.txt","Этот текст был добавлен в этот файл во второй задаче!" );
    }
}
