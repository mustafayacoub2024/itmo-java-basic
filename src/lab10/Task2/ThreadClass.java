package lab10.Task2;

public class ThreadClass implements Runnable {
    private int threadNum;

    public ThreadClass(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        System.out.println("Поток номер: " + threadNum + " во время выполнения: " + Thread.currentThread().getState());
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("Поток " + threadNum + " выполняется. Шаг " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Поток " + threadNum + " завершен."+ Thread.currentThread().getState());
    }
}

