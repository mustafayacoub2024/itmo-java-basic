package lab4.Part1;

public class Task2 {
    public static void result(int num){
        for(int i=1;i<=num;i++){
            if(i%3==0){
                System.out.print(i+",");
            }
        }
        System.out.println();

        for(int i=1;i<=num;i++){
            if(i%5==0){
                System.out.print(i+",");
            }
        }
        System.out.println();

        for(int i=1;i<=num;i++){
            if(i%3==0 & i%5==0){
                System.out.print(i+",");
            }
        }
    }
    public static void main(String[] args) {
result(100);
    }
}
