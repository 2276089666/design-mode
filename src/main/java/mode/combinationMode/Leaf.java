package mode.combinationMode;

/**
 * @Author ws
 * @Date 2021/4/25 22:17
 * @Version 1.0
 */
public class Leaf extends Component{

    private String id;

    public Leaf(String id) {
        this.id = id;
    }

    @Override
    public void add(Component component) {
        throw new RuntimeException("叶子节点不能增删改");
    }

    @Override
    public void remove(Component component) {
        throw new RuntimeException("叶子节点不能增删改");
    }

    @Override
    public Component getChild(int i) {
        throw new RuntimeException("叶子节点不能增删改");
    }

    @Override
    public void operation() {
        System.out.println("叶子节点"+id);
    }
}
