package mode.behavioral.command.concreteCommand;

import mode.behavioral.command.Text;
import mode.behavioral.command.receiver.Receiver;

/**
 * @Author ws
 * @Date 2021/6/2 20:20
 */
public class InsertCommand implements Command {

    // 命令真正的执行者
    private Receiver receiver;
    // 命令作用的对象，文本域
    private Text text;
    // 插入的长度
    private int insertIndex;
    // 插入的值
    private String insertValue;

    public InsertCommand(Receiver receiver, Text text, int insertIndex, String insertValue) {
        this.receiver = receiver;
        this.text = text;
        this.insertIndex = insertIndex;
        this.insertValue = insertValue;
    }

    @Override
    public void execute() {
        System.out.println("插入命令执行~");
        receiver.action(text, this, insertIndex, insertValue);
    }

    @Override
    public void undo() {
        System.out.println("插入命令回滚~");
        receiver.unAction(text, this);
    }

}
