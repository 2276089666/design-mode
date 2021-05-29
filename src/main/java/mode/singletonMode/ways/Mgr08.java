package mode.singletonMode.ways;

import java.lang.reflect.InvocationTargetException;

/**
 * 最完美的写法
 * 不仅可以解决线程同步，还可以防止反序列化。（防止用反射强行new）
 * 原因：枚举没有构造方法，反射拿不到构造方法强行创建不了对象
 */
public enum Mgr08 {

    INSTANCE;

    // 业务方法不能为static,否则失去初衷
    public void m() {
        System.out.println("业务");
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
        Mgr08.INSTANCE.m();
        // 没有构造函数 java.lang.NoSuchMethodException: mode.singletonMode.ways.Mgr08.<init>()
//        Class<Mgr08> mgr08Class = Mgr08.class;
//        Constructor<Mgr08> declaredConstructor = mgr08Class.getDeclaredConstructor();
//        Mgr08 mgr08 = declaredConstructor.newInstance();
//        mgr08.m();
    }

}
