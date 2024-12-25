package lab4.Part2;

public class Task1 {
    public static boolean result(int... array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(result(5, 2, 3, 4, 5) ? "OK" : "Please, try again");
        System.out.println(result(1, 2, 3, 4, 5) ? "OK" : "Please, try again");

    }
}
