package mode.behavioral.command.receiver;

import mode.behavioral.command.Text;
import mode.behavioral.command.concreteCommand.Command;

/**
 * @Author ws
 * @Date 2021/10/1 10:58
 */
public class DelReceiver extends Receiver {
    public DelReceiver() {
        super();
    }

    @Override
    public void action(Text text, Command command, Object... objects) {
        int deleteIndex = (int) objects[0];
        int deleteLength = (int) objects[1];
        StringBuilder value = text.getValue();
        String delString = value.substring(deleteIndex, deleteIndex + deleteLength);
        stack.push(new Node(deleteIndex, delString));
        value.delete(deleteIndex, deleteIndex + deleteLength);

    }

    @Override
    public void unAction(Text text, Command command) {
        StringBuilder value = text.getValue();
        Node node = stack.pop();
        value.insert(node.index, node.value);
        text.setValue(value);
    }


}
