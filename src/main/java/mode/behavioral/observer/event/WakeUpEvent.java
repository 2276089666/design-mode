package mode.behavioral.observer.event;

import mode.behavioral.observer.Event;

/**
 * @Author ws
 * @Date 2021/5/31 20:07
 */
public class WakeUpEvent extends Event {

    private String time;  // 事件发生时间
    private String location; // 事件发生的地点


    public WakeUpEvent(Object source, String time, String location) {
        super(source);
        this.time = time;
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

}
