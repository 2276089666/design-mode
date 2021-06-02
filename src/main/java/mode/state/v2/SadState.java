package mode.state.v2;

/**
 * @Author ws
 * @Date 2021/6/2 22:45
 */
public class SadState implements State{
    @Override
    public void smile() {
        System.out.println("笑不出啦");
    }

    @Override
    public void cry() {
        System.out.println("呜呜呜");
    }

    @Override
    public void say() {
        System.out.println("哼😕");
    }
}
