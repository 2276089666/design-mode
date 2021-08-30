package mode.structuralType.composite;

/**
 * @Author ws
 * @Date 2021/4/25 22:11
 * @Version 1.0
 */
public abstract class Component {
    protected String name;
    public Component(String name) {
        this.name = name;
    }
    public void print() {
        print(0);
    }
    abstract void print(int level);
    abstract public void add(Component component);
    abstract public void remove(Component component);
}
