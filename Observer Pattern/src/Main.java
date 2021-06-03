public class Main {
    public static void main(String[] args)
    {
        Human aman = new Human(23, "Aman");
        Human neeraj = new Human(20, "Neeraj");
        Subject s = new Subject(30);
        s.addObserver(aman);
        s.addObserver(neeraj);

        s.setWeather(35);

        s.removeObserver(aman);
        s.setWeather(40);

        s.addObserver(aman);
        s.setWeather(45);

        s.removeAllObserver();
        s.setWeather(50);
    }
}
