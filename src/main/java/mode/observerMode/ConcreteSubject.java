package mode.observerMode;

/**
 * @Author ws
 * @Date 2021/5/26 22:41
 */
public class ConcreteSubject extends Subject{
    @Override
    public void notifyObserver(String message) {
        for (Observer observer : observers) {
            System.out.println("通知所有观察者，消息更新");
            observer.dataChange(message);
        }
    }
}
