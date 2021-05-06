package mode.flyweightModel;

/**
 * @Author ws
 * @Date 2021/5/6 22:00
 * @Version 1.0
 */
public abstract class Flyweight {
    /**
     * 内部状态指对象共享出来的信息，存储在享元对象内部并且不会随环境的改变而改变；
     * 外部状态指对象得以依赖的一个标记，是随环境改变而改变的、不可共享的状态。
     */
    //内部状态
    public String intrinsic;
    //外部状态
    protected final String extrinsic;

    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public abstract void operate(int extrinsic);

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
