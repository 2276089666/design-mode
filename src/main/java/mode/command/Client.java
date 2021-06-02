package mode.command;

import mode.command.commandInstance.DeleteCommand;

/**
 * @Author ws
 * @Date 2021/6/2 20:39
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 命令模式一般用在回滚等操作
         */
        Content content = new Content("hello word !!!");
        DeleteCommand deleteCommand = new DeleteCommand(content);
        // 执行删除命令
        deleteCommand.execute();
        System.out.println(content.getMessage());
        // 删除撤销
        deleteCommand.undo();
        System.out.println(content.getMessage());
    }
}
