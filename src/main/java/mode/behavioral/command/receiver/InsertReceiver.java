package mode.behavioral.command.receiver;

import mode.behavioral.command.Text;
import mode.behavioral.command.concreteCommand.Command;

/**
 * @Author ws
 * @Date 2021/10/1 13:04
 */
public class InsertReceiver extends Receiver {
    @Override
    public void action(Text text, Command command, Object... objects) {
        int insertIndex= (int) objects[0];
        String insertValue= (String) objects[1];
        stack.push(new Node(insertIndex,insertValue));
        StringBuilder value = text.getValue();
        value.insert(insertIndex,insertValue);
    }

    @Override
    public void unAction(Text text, Command command) {
        StringBuilder value = text.getValue();
        Node node = stack.pop();
        value.delete(node.index,node.index+node.value.length());
    }
}
