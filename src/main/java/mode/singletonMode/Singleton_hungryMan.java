package mode.singletonMode;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用！
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 * Class.forName("")
 * （话说你不用的，你装载它干啥）
 */
public class Singleton_hungryMan {
    private static final Singleton_hungryMan INSTANCE = new Singleton_hungryMan();

    private Singleton_hungryMan() {};

    public static Singleton_hungryMan getInstance() {
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        Singleton_hungryMan m1 = Singleton_hungryMan.getInstance();
        Singleton_hungryMan m2 = Singleton_hungryMan.getInstance();
        System.out.println(m1 == m2);
    }
}
