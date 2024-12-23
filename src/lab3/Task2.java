package lab3;

public class Task2 {
    String color;
    String name;
    double weight;

    public static void print(String color, String name, String weightStr) {
        double weight = Double.parseDouble(weightStr);
        System.out.println(color + " " + name + " " + weight);
    }

    public Task2() {
    }

    public Task2(String color) {
        this.color = color;
    }

    public Task2(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Task2{" +
               "color='" + color + '\'' +
               ", name='" + name + '\'' +
               ", weight=" + weight +
               '}';
    }

    public static void main(String[] args) {
        Task2 task1 = new Task2();
        task1.color = "Чёрный";
        task1.name= "Порш";
        task1.weight = 1.5;
        System.out.println(task1.color + " " + task1.name+ " " + task1.weight);

        print("Красный", "Мерседес", "5.64");

        Task2 task2 = new Task2("Белый");
        System.out.println(task2);

        Task2 task3 = new Task2("Синий",3.6);
        System.out.println(task3);
    }
}