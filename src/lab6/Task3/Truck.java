package lab6.Task3;

public class Truck extends Car{
    private int numberOfWheels;
    private double theMaximumTotal;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public double getTheMaximumTotal() {
        return theMaximumTotal;
    }

    void newWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
        System.out.println("Количество колес изменено на "+numberOfWheels+" шт ");
    }

    public Truck(int w, String m, char c, float s, int numberOfWheels, double theMaximumTotal) {
        super(w, m, c, s);
        this.numberOfWheels = numberOfWheels;
        this.theMaximumTotal = theMaximumTotal;
    }
    @Override
    public void outPut () {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
        System.out.println("Количество колёс - "+ getNumberOfWheels()+ " и ей максимальный весь - "+ theMaximumTotal+"кг. ");
    }
}
