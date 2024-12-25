package lab4.Part1;

public class Task3 {
    public static boolean result(int num1, int num2, int num3) {
        return num1 + num2 == num3;
    }
    public static void main(String[] args) {
        System.out.println(result(5, 10, 15));
        System.out.println(result(5, 10, 10));
    }
}
