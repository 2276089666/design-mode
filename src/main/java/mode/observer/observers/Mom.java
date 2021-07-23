package mode.observer.observers;

import mode.observer.Observer;
import mode.observer.event.PlayEvent;
import mode.observer.event.WakeUpEvent;

/**
 * @Author ws
 * @Date 2021/5/31 20:32
 */
public class Mom implements Observer {
    @Override
    public void actionWakeUp(WakeUpEvent event) {
        if (event.consumed){
            return;
        }
        System.out.println("Mom "+event.getTime()+" go to "+event.getLocation()+" have a feeding");
        event.consumed=true;
    }

}
