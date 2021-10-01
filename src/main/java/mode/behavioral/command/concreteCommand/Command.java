package mode.behavioral.command.concreteCommand;

/**
 * @Author ws
 * @Date 2021/5/12 22:33
 * @Version 1.0
 */
public interface Command {
    public abstract void execute();

    public abstract void undo();
}
