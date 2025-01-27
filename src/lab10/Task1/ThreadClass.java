package lab10.Task1;

public class ThreadClass implements Runnable {

    private int threadNum;

    public ThreadClass(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(threadNum+":"+i);
        }
    }
}
