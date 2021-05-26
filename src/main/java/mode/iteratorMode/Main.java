package mode.iteratorMode;

/**
 * @Author ws
 * @Date 2021/5/26 21:09
 */
public class Main {
    public static void main(String[] args) {
        ListCollection collection = new ListCollection();
        collection.add("abc");
        collection.add(1);
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
