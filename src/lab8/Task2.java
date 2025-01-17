package lab8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static List<Integer> addingElementsList(int numberOfElement) {
        List<Integer> list = new ArrayList<Integer>();
        long startTimeList = System.nanoTime();
        for (int i = 0; i < numberOfElement; i++) {
            list.add(i);
        }
        long endTimeList = System.nanoTime();
        long elapsedTimeList = endTimeList - startTimeList;
        System.out.println("Время вставки элементом в Arraylist = "+ elapsedTimeList);
        return list;
    }

    public static List<Integer> addingElementsLinkidList(int numberOfElement){
            List<Integer> linkedList = new LinkedList<Integer>();
            long startTimeLinkedList= System.nanoTime();
            for (int i = 0; i < numberOfElement; i++) {
                linkedList.add(i);
            }
            long endTimeLinkedList= System.nanoTime();
            long elapsedTimeLinkedList = endTimeLinkedList - startTimeLinkedList;
            System.out.println("Время вставки элементом в LinkedList = "+elapsedTimeLinkedList);
            return linkedList;
        }

    public static void getRandomNumber(ArrayList<Integer> list,LinkedList<Integer> linkedList,int numRandom){
        Random random = new Random();
        long startTimeList= System.nanoTime();
        for (int i = 0; i < numRandom; i++) {
            int index = random.nextInt(list.size());
            int element = list.get(index);
        }
        long endTimeList= System.nanoTime();
        long elapsedTimeList = endTimeList - startTimeList;
        System.out.println("Время выборки элементом из Arraylist = "+elapsedTimeList);

        long startTimeLinkedList= System.nanoTime();
        for (int i = 0; i < numRandom; i++) {
            int index = random.nextInt(linkedList.size());
            int element = linkedList.get(index);
        }
        long endTimeLinkedList= System.nanoTime();
        long elapsedTimeLinkedList = endTimeLinkedList - startTimeLinkedList;
        System.out.println("Время выборки элементом из LinkedList = "+elapsedTimeLinkedList);
    }

    public static void main(String[] args) {
       int numberOfElements = 1000000;
       int numberOfRandom = 10000;

       ArrayList<Integer> list =new ArrayList<>(addingElementsList(numberOfElements));
       LinkedList<Integer> linkedList = new LinkedList<>(addingElementsLinkidList(numberOfElements));

       getRandomNumber(list,linkedList,numberOfRandom);
    }
}
