package lab9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task1 {
    public static List<String> fileReader(String fileName){

        try {
            return Files.readAllLines(Path.of(fileName));
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при чтении файла: " + e.getMessage(), e);
        }
    }
    public static void main(String[] args) {
        String fileName = "src/lab9/File.txt";
        List<String> list = fileReader(fileName);
        for(String s : list){
            System.out.println(s);
        }
    }
}
