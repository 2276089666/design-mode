package mode.behavioral.command.commandInstance;

import mode.behavioral.command.Command;
import mode.behavioral.command.Content;

/**
 * @Author ws
 * @Date 2021/6/2 20:26
 */
public class DeleteCommand extends Command {
    private Content content;

    private String deleteString=null;

    public DeleteCommand(Content content) {
        this.content = content;
    }


    @Override
    public void execute() {
        String message = content.getMessage();
        deleteString=message.substring(0,5);
        content.setMessage(message.substring(5,message.length()));
    }

    @Override
    public void undo() {
        String message = content.getMessage();
        content.setMessage(deleteString.concat(message));
    }
}
