package mode.command.commandInstance;

import mode.command.Command;
import mode.command.Content;

/**
 * @Author ws
 * @Date 2021/6/2 20:20
 */
public class InsertCommand extends Command {

   private Content content;

   private String insertString="insert a word";

    public InsertCommand(Content content) {
        this.content = content;
    }

    @Override
    public void execute() {
        String message = content.getMessage();
        message+=insertString;
        content.setMessage(message);
    }

    @Override
    public void undo() {
        String message = content.getMessage();
        message=message.substring(0,message.length()-insertString.length());
        content.setMessage(message);
    }
}
