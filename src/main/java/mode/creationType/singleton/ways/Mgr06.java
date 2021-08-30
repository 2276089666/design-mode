package mode.creationType.singleton.ways;

/**
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 可以通过synchronized解决，但也带来效率下降
 */
public class Mgr06 {
    // volatile解决线程可见和指令重排,避免对象创建的3大主要过程乱序:1.new(申请空间变量,会有默认值) 2.invokeSpecial(调用构造函数赋初值) 3.astore(建立栈中和堆中的引用连接)
    // 当2和3乱序时就会出现问题
    private static /*volatile*/ Mgr06 INSTANCE; //JIT优化存在指令重排，本地代码优化时需要用到volatile

    private Mgr06() {
    }

    public static Mgr06 getInstance() {
        if (INSTANCE == null) {
            //双重检查
            synchronized (Mgr06.class) {
                if(INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();
        }
    }
}
