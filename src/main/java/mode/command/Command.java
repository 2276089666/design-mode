package mode.command;

/**
 * @Author ws
 * @Date 2021/5/12 22:33
 * @Version 1.0
 */
public abstract class Command {
    public abstract void execute();
    public abstract void undo();
}
