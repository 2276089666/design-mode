package mode.adapterMode;

/**
 * @Author ws
 * @Date 2021/4/22 21:04
 * @Version 1.0
 */
public class Adapter implements Target,Adaptee{
    Adaptee adaptee;
    Target target;

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    @Override
    public void SpecificRequest() {
        target.Request();
    }

    @Override
    public void Request() {
        adaptee.SpecificRequest();
    }
}
