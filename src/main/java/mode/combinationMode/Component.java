package mode.combinationMode;

/**
 * @Author ws
 * @Date 2021/4/25 22:11
 * @Version 1.0
 */
public abstract class Component {
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component getChild(int i);
    public abstract void operation();
}
