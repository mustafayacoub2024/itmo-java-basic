package lab4.Part1;

public class Task1 {
    public static void result(int num){
        for(int i=1;i<num;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        result(100);
    }
}
