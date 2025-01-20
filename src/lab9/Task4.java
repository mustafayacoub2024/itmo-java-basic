package lab9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Task4 {
    public static void refactFile(String fileName) {
        try {
            List<String> list = Files.readAllLines(Path.of(fileName));
            StringBuilder sb = new StringBuilder();

            for (String s : list) {
                sb.append(s.replaceAll("[^\\p{L}\\p{N}]", "\\$")).append(System.lineSeparator());
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(sb.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при обработке файла: " + e.getMessage(), e);
        }
    }

    public static void main(String[] args) {
refactFile("src/lab9/File4.txt");
    }
}
