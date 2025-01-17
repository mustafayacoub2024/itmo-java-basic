package lab8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static Set<String> TransformationOfCollections(ArrayList<String> list){
        return new HashSet<>(list);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("World");
        list.add("World");
        list.add("World");
        list.add("World");
        list.add("World");
        list.add("World");
        Set<String> TransformationOfCollections = TransformationOfCollections(list);
        System.out.println(TransformationOfCollections);
    }
}
