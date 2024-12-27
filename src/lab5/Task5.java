package lab5;

public class Task5 {
    public static void result(String str) {

        for (String word : str.split(" ")) {
            StringBuilder builder = new StringBuilder(word);
            builder.reverse();
            System.out.print(builder + " ");
        }
    }

    public static void main(String[] args) {
        result("This is a test string");
    }
}