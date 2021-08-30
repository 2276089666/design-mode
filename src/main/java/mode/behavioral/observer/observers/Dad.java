package mode.behavioral.observer.observers;

import mode.behavioral.observer.Observer;
import mode.behavioral.observer.event.PlayEvent;
import mode.behavioral.observer.event.WakeUpEvent;
import mode.behavioral.observer.source.Child;
import mode.behavioral.observer.source.Daughter;

/**
 * @Author ws
 * @Date 2021/5/31 20:17
 */
public class Dad implements Observer {

    @Override
    public void actionWakeUp(WakeUpEvent event) {
        if (event.consumed){
            return;
        }
        Object source = event.getSource();
        if (source instanceof Child){
            System.out.println("Dad "+event.getTime()+" go to "+event.getLocation()+" give a hug with child");
        }
        event.consumed=true;
    }

    @Override
    public void actionPlay(PlayEvent event) {
        if (event.consumed){
            return;
        }
        Object source = event.getSource();
        if (source instanceof Daughter){
            System.out.println("Dad "+event.getTime()+" go to "+event.getWhere()+" play with daughter");
        }
        event.consumed=true;
    }
}
