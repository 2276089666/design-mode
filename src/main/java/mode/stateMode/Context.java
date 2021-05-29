package mode.stateMode;

/**
 * @Author ws
 * @Date 2021/5/27 10:18
 */
public class Context {
    private AbstractState abstractState;

    public Context(AbstractState abstractState) {
        this.abstractState = abstractState;
    }

    public AbstractState getAbstractState() {
        return abstractState;
    }

    public void setAbstractState(AbstractState abstractState) {
        this.abstractState = abstractState;
    }

    public void action(){
        this.abstractState.action(this);
    }
}
