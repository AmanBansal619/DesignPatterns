import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int weather;
    List<Human> observerList = new ArrayList<Human>();

    public Subject(int weather) {
        this.weather = weather;
    }

    public void setWeather(int weather) {
        this.weather = weather;
        for(int i = 0; i < observerList.size(); ++i)
        {
            observerList.get(i).notifyObserver(weather);
        }
    }

    public int getWeather() {
        return this.weather;
    }

    public void removeObserver(Human human) {
        observerList.remove(human);
    }

    public void removeAllObserver() {
        observerList.clear();
    }

    public void addObserver(Human human) {
        observerList.add(human);
    }
}
