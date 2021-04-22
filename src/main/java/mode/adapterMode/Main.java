package mode.adapterMode;

/**
 * @Author ws
 * @Date 2021/4/22 21:06
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Adaptee());
        adapter.Request();
    }
}
