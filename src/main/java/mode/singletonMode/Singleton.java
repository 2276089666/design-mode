package mode.singletonMode;

/**
 * @Author ws
 * @Date 2021/4/19 17:03
 * @Version 1.0
 */
public class Singleton {
    // volatile解决线程可见和指令重排,避免对象创建的3大主要过程乱序:1.new(申请空间变量,会有默认值) 2.astore(调用构造函数赋初值) 3.invokeSpecial(建立栈中和堆中的引用连接)
    // 当2和3乱序时就会出现问题
    private static volatile Singleton instance;
    private Singleton() {
        System.out.println("单例");
    }
    public static Singleton getInstance(){
        if (instance==null){  // 避免一上来就锁竞争,DCL double check lock
            synchronized (Singleton.class){
                if (instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
