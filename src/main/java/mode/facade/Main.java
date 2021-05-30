package mode.facade;

/**
 * @Author ws
 * @Date 2021/5/6 20:28
 * @Version 1.0
 */

/**
 * 降低系统外部与系统内部交互的复杂性，我们用门面挡在中间
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
