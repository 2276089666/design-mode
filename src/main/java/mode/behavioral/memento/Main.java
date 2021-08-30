package mode.behavioral.memento;

/**
 * @Author ws
 * @Date 2021/5/26 22:23
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 可以用在游戏存档,利用ObjectOutputStream的writeObject和readObject
         * 当然要求对象实现序列化接口
         */
        Original original = new Original("123456");
        Storage storage = new Storage(original.createMemento());
        System.out.println("原始数据"+original.getValue());
        original.setValue("abcd");
        System.out.println("更新备忘录后的内容"+original.getValue());
        original.restoreMemento(storage.getMemento());
        System.out.println("使用备忘录恢复数据"+original.getValue());
    }
}
