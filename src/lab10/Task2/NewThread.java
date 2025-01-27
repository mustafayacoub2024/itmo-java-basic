package lab10.Task2;

public class NewThread {

    public static void threadStart(int num) {

        for (int i = 0; i < num; i++) {
            Thread thread = new Thread(new ThreadClass(i));
            System.out.println("Поток номер: " + i + " перед запуском: " + thread.getState());
            thread.start();
            System.out.println("Поток номер: " + i + " после запуска: " + thread.getState());

        }
    }
}

