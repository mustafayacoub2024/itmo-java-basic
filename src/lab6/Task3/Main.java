package lab6.Task3;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(15000,"Mercedes",'b',180.6f,10,20000.4d);
        truck.outPut();
        truck.newWheels(20);
    }
}
