public class Main {
    public static void main(String[] args) {
        Factory fc = new Factory();
        Car car = fc.createCar("veryPrime");
        car.printDetails();
        car = fc.createCar("prime");
        car.printDetails();
        car = fc.createCar("new");
        car.printDetails();

    }
}
