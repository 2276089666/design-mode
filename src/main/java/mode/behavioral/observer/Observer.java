package mode.behavioral.observer;

import mode.behavioral.observer.event.PlayEvent;
import mode.behavioral.observer.event.WakeUpEvent;

/**
 * @Author ws
 * @Date 2021/5/31 20:16
 */
public interface Observer {
    default void actionWakeUp(WakeUpEvent event){

    }
    default void actionPlay(PlayEvent event){

    }
}
