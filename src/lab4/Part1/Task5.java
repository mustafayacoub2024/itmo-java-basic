package lab4.Part1;

public class Task5 {
    public static boolean result(int... num) {
        if (num[0] == 3 & num[num.length - 1] == 3) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(result(3, -3, 7, 4, 5, 4, 3));
    }
}
