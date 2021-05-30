package mode.singleton.ways;

/**
 * lazy loading
 * 也称懒汉式
 * 减小synchronized的加锁粒度，提高效率
 */
public class Mgr05 {
    private static Mgr05 INSTANCE;

    private Mgr05() {
    }

    public static Mgr05 getInstance() {
        if (INSTANCE == null) {
            //妄图通过减小同步代码块的方式提高效率，然后不可行
            // 后得到锁的线程没有重新if判断，导致对象被创建多个，违反单例
            synchronized (Mgr05.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
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
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }
}
