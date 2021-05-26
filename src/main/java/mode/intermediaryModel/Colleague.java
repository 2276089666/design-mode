package mode.intermediaryModel;

/**
 * @Author ws
 * @Date 2021/5/26 21:33
 */
public abstract class Colleague {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract boolean operation(String message);
}
