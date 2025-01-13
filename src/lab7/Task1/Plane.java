package lab7.Task1;

public class Plane {
    public static void main(String[] args) {
        Wing wing1 = new Wing();
        Wing wing2 = new Wing();
        wing1.setWingWeight(150.8);
        wing2.setWingWeight(226.788);
        wing1.print();
        wing2.print();
    }

     private static class Wing{
       private double wingWeight;

        public double getWingWeight() {
            return wingWeight;
        }

        public void setWingWeight(double wingWeight) {
            this.wingWeight = wingWeight;
        }

        public void print(){
        System.out.println(getWingWeight());
    }
    }
}
