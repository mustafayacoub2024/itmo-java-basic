package lab5;

public class Task3 {
    public static void result(String str) {

        System.out.println(str.replace("бяка","[вырезано цензурой]"));
    }

    public static void main(String[] args) {
        result("бяка привет бяка пойдём домой бяка улыбнись ");
    }
}
