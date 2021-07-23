package mode.iterator;

/**
 * @Author ws
 * @Date 2021/6/2 12:30
 */
// 迭代器模式优点,多个线程同时访问同一个集合,每个线程可见的集合元素的下标不会乱,每个线程都有集合元素的独立下标
public class Client {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("size:\t"+list.size());
        Thread t1 = new Thread(() -> {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                try {
                    System.out.println(Thread.currentThread().getName()+"\t"+iterator.next());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.println(Thread.currentThread().getName()+"\t"+iterator.next());
            }
        });

        t1.start();
        t2.start();
    }
}
