package lab10.Task1;

public class NewThread {

    public static void threadStart(int num){

        for(int i = 0; i < num; i++){
            Thread thread = new Thread(new ThreadClass(i));
            thread.start();
        }
    }
}