public class Factory {
    private Car BMW = new Car(4, "black", "BMW");
    private Car Audi = new Car(4, "red", "Audi");
    private Car Maruti = new Car(4, "blue", "Maruti");

    public Car createCar(String type) {
        if (type == "veryPrime") {
            return BMW;
        } else if (type == "prime") {
            return Audi;
        } else {
            return Maruti;
        }
    }
}
