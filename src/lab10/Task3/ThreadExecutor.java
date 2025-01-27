package lab10.Task3;

import java.util.concurrent.CountDownLatch;

public class ThreadExecutor {

    public void executeThreads(Counter counter, int numberOfThreads, int incrementsPerThread) {

        CountDownLatch latch = new CountDownLatch(numberOfThreads);


        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(new WorkerThread(counter, incrementsPerThread, latch)).start();
        }


        try {
            latch.await();
        } catch (InterruptedException e) {
            System.out.println("Ожидание было прервано: " + e.getMessage());
        }

        System.out.println("Итоговое значение count: " + counter.getCount());
    }
}