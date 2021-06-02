package mode.adapter;

/**
 * @Author ws
 * @Date 2021/4/22 21:06
 * @Version 1.0
 */

/**
 * 有时候带Adapter后缀不一定是适配器模式,例如:WindowAdapter对于 WindowListener, WindowStateListener, WindowFocusListener
 * 上面三个接口,只是实现了一些空方法,让我们使用某个接口的现实,例如WindowListener,我们只重写我们需要的方法,WindowListener别的
 * 抽象方法已经被WindowAdapter的空方法实现了
 */
public class Main {
    public static void main(String[] args) {
        // 双向适配
        Adapter adapter = new Adapter();
        adapter.setAdaptee(new ConcreteAdaptee());
        adapter.setTarget(new ConcreteTarget());

        // Adaptee适配Target
        adapter.AdapteeRequest();

        // Target适配Adaptee
        adapter.TargetRequest();
    }
}
