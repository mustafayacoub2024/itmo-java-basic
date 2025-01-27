package lab10.Task3;

import java.util.concurrent.CountDownLatch;

public class WorkerThread implements Runnable {

    private final Counter counter;
    private final int increments;
    private final CountDownLatch latch;

    public WorkerThread(Counter counter, int increments, CountDownLatch latch) {
        this.counter = counter;
        this.increments = increments;
        this.latch = latch;
    }

    @Override
    public void run() {
        for (int i = 0; i < increments; i++) {
            counter.increment();
        }

        latch.countDown();
    }
}