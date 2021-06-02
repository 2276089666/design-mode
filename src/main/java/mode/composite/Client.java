package mode.composite;

/**
 * @Author ws
 * @Date 2021/4/25 22:22
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        Component node1 = new Leaf("1");
        Component node2 = new Composite("2");
        Component node3 = new Leaf("3");
        root.add(node1);
        root.add(node2);
        root.add(node3);

        Component node21 = new Leaf("21");
        Component node22 = new Composite("22");
        node2.add(node21);
        node2.add(node22);

        Component node221 = new Leaf("221");
        node22.add(node221);
        root.print();
    }
}
