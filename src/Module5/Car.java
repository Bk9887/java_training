package Module5;

public class Car {
    String brandName;
    int manuDate;
    Car(String brandName, int manuDate) {
        this.brandName = brandName;
        this.manuDate = manuDate;
    }
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 15);
        System.out.println("brandname="+ c1.brandName);
        System.out.println("manudate="+ c1.manuDate);
    }
}
