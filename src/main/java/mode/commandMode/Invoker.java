package mode.commandMode;

/**
 * @Author ws
 * @Date 2021/5/12 22:34
 * @Version 1.0
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void open(){
        command.execute();
    }

    public void change(){
        command.execute();
    }

    public void close(){
        command.execute();
    }
}
