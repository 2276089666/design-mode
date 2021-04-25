package mode.adapterMode;

/**
 * @Author ws
 * @Date 2021/4/25 20:55
 * @Version 1.0
 */
public class ConcreteTarget implements Target{
    @Override
    public void Request() {
        System.out.println("Request");
    }
}
