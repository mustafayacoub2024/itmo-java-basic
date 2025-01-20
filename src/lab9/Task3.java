package lab9;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void mergeFile(String fileName1, String fileName2, String fileName3) {
        List<String> list1 = Task1.fileReader(fileName1);
        List<String> list2 = Task1.fileReader(fileName2);

        List<String> mergedContent = new ArrayList<>(list1);
        mergedContent.addAll(list2);

        for (String s : mergedContent) {
            Task2.fileWriter(fileName3, s);
        }


    }

    public static void main(String[] args) {
    mergeFile("src/lab9/File.txt", "src/lab9/File2.txt", "src/lab9/File3.txt");

    }
}