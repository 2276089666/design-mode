package mode.observer.source;

import mode.observer.Observer;
import mode.observer.event.PlayEvent;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author ws
 * @Date 2021/5/31 20:48
 */
public class Daughter {
    // 故意让观察者无序，创造消息被任何一个观察者先看到的场景
    Set<Observer> observers=new HashSet<>();
    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public void play(){
        PlayEvent event = new PlayEvent(this, "武汉", "12:00");
        for (Observer observer : observers) {
            observer.actionPlay(event);
        }
    }
}
