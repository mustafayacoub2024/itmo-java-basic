package lab6.Task5;

import java.util.Scanner;

public class SuperClass {
    Scanner sc = new Scanner(System.in);

    int getAge() {
        int age = sc.nextInt();
        return age;
    }
}