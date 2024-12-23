package lab3;

import java.time.LocalDate;

public class House {
    int numberOfFloors;
    int yearOfConstruction;
    String name;

    public House(int numberOfFloors, int yearOfConstruction, String name) {
        this.numberOfFloors = numberOfFloors;
        this.yearOfConstruction = yearOfConstruction;
        this.name = name;
    }

    public static void outputAllValues(House house) {
        System.out.println("Дом состоит из " + house.numberOfFloors + " этажей."
                           + " Дом был построен в " + house.yearOfConstruction + " году. "
                           + "Название дома " + house.name);
    }

    public static int result(int yearOfConstruction) {
        int currentYear = LocalDate.now().getYear();
        return currentYear - yearOfConstruction;
    }

    public static void main(String[] args) {
        House house1 = new House(5, 2016, "House 1");
        House house2 = new House(15, 2000, "House 2");
        outputAllValues(house1);
        outputAllValues(house2);
        System.out.println(result(house1.yearOfConstruction));
        System.out.println(result(house2.yearOfConstruction));
    }
}