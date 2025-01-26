package lab10.Task3;

public class WorkerThread implements Runnable {

    private final Counter counter;
    private final int increments;

    public WorkerThread(Counter counter, int increments) {
        this.counter = counter;
        this.increments = increments;
    }

    @Override
    public void run() {
        for (int i = 0; i < increments; i++) {
            counter.increment();
        }
    }
}
