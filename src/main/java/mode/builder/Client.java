package mode.builder;

/**
 * @Author ws
 * @Date 2021/6/2 18:21
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 本来Person的构造参数很多,是一个极其复杂的对象
         * 现在我们创建Person只需要实现PersonBuilder接口,不同的实现可以链式的创建不同的Person对象
         */
        ComplexPersonBuilder complexPersonBuilder = new ComplexPersonBuilder();
        Person person = complexPersonBuilder.buildInfo(1, "张三").buildLocation("和平大道", "2813").weight(50.0).score(5).build();
        System.out.println(person);
    }
}
