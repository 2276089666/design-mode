package mode.behavioral.command.receiver;

import mode.behavioral.command.Text;
import mode.behavioral.command.concreteCommand.Command;

import java.util.Stack;

/**
 * @Author ws
 * @Date 2021/10/1 10:24
 */
public abstract class Receiver {
    public class Node {
        int index;
        String value;

        public Node(int index, String value) {
            this.index = index;
            this.value = value;
        }
    }

    Stack<Node> stack;

    public Receiver() {
        this.stack = new Stack<>();
    }

    public abstract void action(Text text, Command command, Object... objects);

    public abstract void unAction(Text text, Command command);
}
