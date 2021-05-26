package mode.memoMode;

/**
 * @Author ws
 * @Date 2021/5/26 22:23
 */
public class Main {
    public static void main(String[] args) {
        Original original = new Original("张三");
        Storage storage = new Storage(original.createMemento());
        System.out.println("原始数据"+original.getValue());
        original.setValue("李四");
        System.out.println("更新备忘录后的内容"+original.getValue());
        original.restoreMemento(storage.getMemento());
        System.out.println("使用备忘录恢复数据"+original.getValue());
    }
}
