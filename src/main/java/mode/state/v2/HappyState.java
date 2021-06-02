package mode.state.v2;

/**
 * @Author ws
 * @Date 2021/6/2 22:44
 */
public class HappyState implements State{
    @Override
    public void smile() {
        System.out.println("哈哈哈哈");
    }

    @Override
    public void cry() {
        System.out.println("激动的泪水");
    }

    @Override
    public void say() {
        System.out.println("摸摸哒");
    }
}
