package mode.behavioral.command;

import mode.behavioral.command.concreteCommand.DeleteCommand;
import mode.behavioral.command.concreteCommand.InsertCommand;
import mode.behavioral.command.receiver.DelReceiver;
import mode.behavioral.command.receiver.InsertReceiver;

/**
 * @Author ws
 * @Date 2021/6/2 20:39
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 命令模式一般用在回滚等操作
         */
        // 1.创建被命令作用的对象
        Text text = new Text(new StringBuilder("123456789"));
        System.out.println("执行命令前的text:\t" + text.getValue());
        // 2.创建操作者
        DelReceiver delReceiver = new DelReceiver();
        InsertReceiver insertReceiver = new InsertReceiver();
        // 3.封装命令
        DeleteCommand command = new DeleteCommand(delReceiver, text, 2, 2);
        DeleteCommand command2 = new DeleteCommand(delReceiver, text, 2, 2);
        InsertCommand command3 = new InsertCommand(insertReceiver, text, 4, "00");
        // 4.创建调用者并追加命令
        Invoker invoker = new Invoker();
        invoker.addCommand(command);
        invoker.addCommand(command2);
        invoker.addCommand(command3);
        // 5.执行所有命令
        invoker.finishInvoker();

        System.out.println("执行命令后的text:\t" + text.getValue());

        // 6.执行回滚
        invoker.undoStep(2);

        System.out.println("执行命令后的text:\t" + text.getValue());
    }
}
