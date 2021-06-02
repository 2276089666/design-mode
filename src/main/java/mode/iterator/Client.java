package mode.iterator;

/**
 * @Author ws
 * @Date 2021/6/2 12:30
 */
public class Client {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("size:\t"+list.size());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
