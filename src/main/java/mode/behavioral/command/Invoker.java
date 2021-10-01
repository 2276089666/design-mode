package mode.behavioral.command;

import mode.behavioral.command.concreteCommand.Command;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @Author ws
 * @Date 2021/6/2 20:20
 */
public class Invoker {
    ArrayList<Command> commands;

    public Invoker() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    // 批量执行所有命令
    public void finishInvoker() {
        System.out.println("开始执行所有命令~");
        ListIterator<Command> iterator = commands.listIterator();
        while (iterator.hasNext()) {
            Command c = iterator.next();
            c.execute();
        }
    }

    // 反向执行命令回滚
    public void undoStep(int step) {
        System.out.println("回滚:\t" + step + " 步~");
        ListIterator<Command> iterator = commands.listIterator(commands.size());
        while (iterator.hasPrevious()) {
            if (step == 0) break;
            Command c = iterator.previous();
            c.undo();
            step--;
        }
    }
}
