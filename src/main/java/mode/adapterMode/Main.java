package mode.adapterMode;

/**
 * @Author ws
 * @Date 2021/4/22 21:06
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.setAdaptee(new ConcreteAdaptee());
        adapter.setTarget(new ConcreteTarget());
        adapter.Request();
        adapter.SpecificRequest();
    }
}
