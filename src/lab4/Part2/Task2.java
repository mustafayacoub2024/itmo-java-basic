package lab4.Part2;

import java.util.Scanner;

public class Task2 {
    public static int[] result() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int number = scanner.nextInt();
        int[] array = new int[number];

        System.out.println("Введите элементы массива");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void print(int[] array){
        System.out.println("Длина массива равно= "+array.length);
        System.out.print("Элементы массива= [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        print(result());
    }
}