package mode.behavioral.observer.source;

import mode.behavioral.observer.Observer;
import mode.behavioral.observer.event.WakeUpEvent;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author ws
 * @Date 2021/5/31 20:07
 */
public class Child {
    // 故意让观察者无序，创造消息被任何一个观察者先看到的场景
    Set<Observer> observers=new HashSet<>();
    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public void wakeUp(){
        WakeUpEvent wakeUpEvent = new WakeUpEvent(this,"15:30", "房间");
        for (Observer observer : observers) {
            observer.actionWakeUp(wakeUpEvent);
        }
    }
}
