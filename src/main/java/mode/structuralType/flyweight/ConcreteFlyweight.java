package mode.structuralType.flyweight;

/**
 * @Author ws
 * @Date 2021/5/6 22:10
 * @Version 1.0
 */
public class ConcreteFlyweight implements Flyweight{
    /**
     * intrinsicState内部状态指对象共享出来的信息，存储在享元对象内部并且不会随环境的改变而改变；
     * ExtrinsicState外部状态指对象得以依赖的一个标记，是随环境改变而改变的、不可共享的状态。
     */
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void doOperation(String extrinsicState) {
        System.out.println("Object address: " + System.identityHashCode(this));
        System.out.println("IntrinsicState: " + intrinsicState);
        System.out.println("ExtrinsicState: " + extrinsicState);
    }
}
