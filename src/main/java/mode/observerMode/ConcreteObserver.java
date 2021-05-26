package mode.observerMode;

/**
 * @Author ws
 * @Date 2021/5/26 22:43
 */
public class ConcreteObserver implements Observer{
    @Override
    public void dataChange(String message) {
        System.out.println("接收的消息：\t"+message);
    }
}
