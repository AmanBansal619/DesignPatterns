public class Human implements Observer {
    String name;
    int age;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void printDetails() {
        System.out.printf(this.name + " " + this.age);
    }

    @Override
    public void notifyObserver(int newWeather) {
        System.out.println(this.name + "->" + this.age + "->" + newWeather);
    }
}
