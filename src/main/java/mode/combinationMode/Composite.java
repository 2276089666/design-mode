package mode.combinationMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ws
 * @Date 2021/4/25 22:20
 * @Version 1.0
 */
public class Composite extends Component{
    List<Component> list =new ArrayList<>();

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        list.forEach((a)->{
            a.operation();
        });
    }
}
