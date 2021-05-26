package mode.observerMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ws
 * @Date 2021/5/26 22:37
 */
public abstract class Subject {
    protected List<Observer> observers=new ArrayList<>();
    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyObserver(String message);
}
