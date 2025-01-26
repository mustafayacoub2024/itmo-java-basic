package lab10.Task4;

public class Main {

    public static void main(String[] args) {

        Object lock = new Object();

        Thread thread1 = new Thread(new ThreadClass("Первый поток", lock));
        Thread thread2 = new Thread(new ThreadClass("Второй поток", lock));

        thread1.start();
        thread2.start();
    }
}