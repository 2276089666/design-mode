package mode.commandMode.commandInstance;

import mode.commandMode.Command;
import mode.commandMode.Tv;

/**
 * @Author ws
 * @Date 2021/5/12 22:44
 * @Version 1.0
 */
public class TvCloseCommand extends Command {
    private Tv tv;

    public TvCloseCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.close();
    }
}
