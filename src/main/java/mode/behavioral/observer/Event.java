package mode.behavioral.observer;

/**
 * @Author ws
 * @Date 2021/5/31 20:06
 */
public abstract class Event {
    public boolean consumed = false;  // 是否被消费
    private Object source;   // 事件发起的源对象

    // 事件源对象
    public Object getSource() {
        return source;
    }

    public Event(Object source) {
        this.source = source;
    }
}
