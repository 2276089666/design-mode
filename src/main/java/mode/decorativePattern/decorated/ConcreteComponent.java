package mode.decorativePattern.decorated;

import mode.decorativePattern.Component;

/**
 * @Author ws
 * @Date 2021/5/6 19:25
 * @Version 1.0
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("被装饰的对象操作,进行具体操作的");
    }
}
