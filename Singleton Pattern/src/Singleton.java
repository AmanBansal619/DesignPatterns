public class Singleton {
    private String name;
    private static Singleton instance = null;

    private Singleton(String name) {
        this.name = name;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton("Neeraj");
        }
        return instance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
