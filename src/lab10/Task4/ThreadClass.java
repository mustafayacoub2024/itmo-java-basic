package lab10.Task4;

public class ThreadClass implements Runnable {

    private final String name;
    private final Object lock;

    public ThreadClass(String name, Object lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                System.out.println(name);
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

