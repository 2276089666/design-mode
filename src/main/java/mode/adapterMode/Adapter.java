package mode.adapterMode;

/**
 * @Author ws
 * @Date 2021/4/22 21:04
 * @Version 1.0
 */
public class Adapter implements Target{
    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void Request() {
        adaptee.SpecificRequest();
    }
}
