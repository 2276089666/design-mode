package mode.structuralType.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ws
 * @Date 2021/4/25 22:20
 * @Version 1.0
 */
public class Composite extends Component{
    private List<Component> child;

    public Composite(String name) {
        super(name);
        child = new ArrayList<>();
    }

    @Override
    void print(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println("Composite:" + name);
        for (Component component : child) {
            component.print(level + 1);
        }
    }

    @Override
    public void add(Component component) {
        child.add(component);
    }

    @Override
    public void remove(Component component) {
        child.remove(component);
    }
}
