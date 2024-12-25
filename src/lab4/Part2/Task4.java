package lab4.Part2;

public class Task4 {
    public static void result(int... array) {

        for (int i = 0; i < array.length; i++) {
            int temp = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    temp++;
                }
            }
            if (temp == 1) {
                System.out.println(array[i]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        result(1, 2, 3, 1, 2, 4);
    }
}
