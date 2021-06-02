package mode.adapter;

/**
 * @Author ws
 * @Date 2021/4/22 21:04
 * @Version 1.0
 */
public class Adapter implements Target, Adaptee {
    private Adaptee adaptee;
    private Target target;

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void setTarget(Target target) {
        this.target = target;
    }


    @Override
    public void AdapteeRequest() {
        target.TargetRequest();
    }

    @Override
    public void TargetRequest() {
        adaptee.AdapteeRequest();
    }
}
