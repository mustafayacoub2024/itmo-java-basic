package lab1;

public class Task6 {
    public static void resultIf(int b) {
        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b<100) {
            System.out.println("Чётное");
        } else {
            System.out.println("Выход за пределы диапазона");
        }
    }

    public static void main(String[] args) {
        resultIf(11);
        resultIf(10);
        resultIf(1000);
    }
}