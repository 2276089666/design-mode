package mode.factoryMode;

/**
 * @Author ws
 * @Date 2021/5/29 18:27
 */
public class Client {
    public static void main(String[] args) {
        // 对增加Callable的实现类,单一产品比较友好
        Factory factory = new Factory();
        Callable phone = factory.createPhone("Xiaomi");
        System.out.println(phone.brand());
    }
}
