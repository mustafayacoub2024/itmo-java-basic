package lab4.Part2;

public class Task3 {
    public static void result(int... array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        result(1, 2, 3, 4, 5);
        result(5, 6, 7, 2);
    }
}
