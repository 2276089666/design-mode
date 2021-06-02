package mode.chainOfResponsibility.askForLeave;

/**
 * @Author ws
 * @Date 2021/5/12 21:54
 * @Version 1.0
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}
