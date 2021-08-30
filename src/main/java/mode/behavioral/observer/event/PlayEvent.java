package mode.behavioral.observer.event;


import mode.behavioral.observer.Event;


/**
 * @Author ws
 * @Date 2021/5/31 20:53
 */
public class PlayEvent extends Event {

    String where;
    String time;

    public PlayEvent(Object source, String where, String time) {
        super(source);
        this.where = where;
        this.time = time;
    }

    public String getWhere() {
        return where;
    }

    public String getTime() {
        return time;
    }
}
