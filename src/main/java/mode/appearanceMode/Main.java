package mode.appearanceMode;

/**
 * @Author ws
 * @Date 2021/5/6 20:28
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new ConcreteFacade1();
        facade.method1();

        System.out.println("================");
        Facade facade1 = new ConcreteFacade2();
        facade1.method2();
    }
}
