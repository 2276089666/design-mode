package mode.observerMode;

/**
 * @Author ws
 * @Date 2021/5/26 22:44
 */
public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();
        subject.add(observer1);
        subject.add(observer2);
        subject.notifyObserver("老师来了，快进教师");
    }
}
