public class Car {
    int numberOfTyres;
    String color;
    String company;

    public Car(int numberOfTyres, String color, String company) {
        this.numberOfTyres = numberOfTyres;
        this.color = color;
        this.company = company;
    }

    public void printDetails() {
        System.out.println(this.company + " " + this.color + " " + this.numberOfTyres);
    }
}
