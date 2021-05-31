package mode.observer;

import mode.observer.event.PlayEvent;
import mode.observer.event.WakeUpEvent;

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
