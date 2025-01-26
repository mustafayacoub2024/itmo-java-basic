package lab10.Task3;

public class ThreadExecutor {

    public void executeThreads(Counter counter, int numberOfThreads, int incrementsPerThread) {

        Thread[] threads = new Thread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(new WorkerThread(counter, incrementsPerThread));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Итоговое значение count: " + counter.getCount());
    }
}