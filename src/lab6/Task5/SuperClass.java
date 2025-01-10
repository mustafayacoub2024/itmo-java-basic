package lab6.Task5;

import java.util.Scanner;

public class SuperClass {

    int age;
    String name;

    Scanner sc = new Scanner(System.in);

    void setAge(){
        this.age = sc.nextInt();
    }

    int getAge() {
        return age;
    }
}