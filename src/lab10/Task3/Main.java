package lab10.Task3;

public class Main {
    public static void main(String[] args) {

        Counter counter = new Counter();
        int numberOfThreads = 100;
        int incrementsPerThread = 1000;

        ThreadExecutor executor = new ThreadExecutor();
        executor.executeThreads(counter, numberOfThreads, incrementsPerThread);
    }
}