package mode.behavioral.command.concreteCommand;

import mode.behavioral.command.Text;
import mode.behavioral.command.receiver.Receiver;

/**
 * @Author ws
 * @Date 2021/6/2 20:26
 */
public class DeleteCommand implements Command {

    // 命令真正的执行者
    private Receiver receiver;
    // 命令作用的对象，文本域
    private Text text;
    // 删除的长度
    private int deleteLength;
    // 开始删除的下标
    private int deleteIndex;

    public DeleteCommand(Receiver receiver, Text text, int deleteIndex, int deleteLength) {
        this.receiver = receiver;
        this.text = text;
        this.deleteLength = deleteLength;
        this.deleteIndex = deleteIndex;
    }

    @Override
    public void execute() {
        System.out.println("删除命令执行~");
        receiver.action(text, this, deleteIndex, deleteLength);
    }

    @Override
    public void undo() {
        System.out.println("删除命令回滚~");
        receiver.unAction(text, this);
    }
}
