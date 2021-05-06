package mode.decorativePattern;

/**
 * @Author ws
 * @Date 2021/5/6 19:28
 * @Version 1.0
 */
public abstract class Decorator extends Component{
    private Component component=null;
    public Decorator(Component component) {
        this.component=component;
    }

    @Override
    public void operation() {
        // 关键,调用被装饰对象的具体操作
        if (component!=null){
            this.component.operation();
        }
    }
}
