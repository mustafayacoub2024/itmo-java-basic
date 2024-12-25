package lab4.Part1;

public class Task6 {
    public static boolean result(int... num) {
        for (int i : num) {
            if (i == 1 || i == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(result(1, 1, 2));
        System.out.println(result(3, 1, 2));
        System.out.println(result(4, 5, 2));
    }
}
