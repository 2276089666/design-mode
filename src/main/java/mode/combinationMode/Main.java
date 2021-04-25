package mode.combinationMode;

/**
 * @Author ws
 * @Date 2021/4/25 22:22
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Composite head = new Composite();
        Composite child = new Composite();
        head.list.add(child);
        child.list.add(new Leaf("1"));
        head.list.add(new Leaf("2"));

        head.operation();
    }
}
