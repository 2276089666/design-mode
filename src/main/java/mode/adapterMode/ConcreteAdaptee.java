package mode.adapterMode;

/**
 * @Author ws
 * @Date 2021/4/25 20:54
 * @Version 1.0
 */
public class ConcreteAdaptee implements Adaptee{
    @Override
    public void SpecificRequest() {
        System.out.println("SpecificRequest");
    }
}
