package lab6.Task5;

public class Main {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        String name = cc.getName();
        int age = cc.getAge();
        System.out.println(name+" "+age);
    }
}
