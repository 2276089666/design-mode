package mode.commandMode.commandInstance;

import mode.commandMode.Command;
import mode.commandMode.Tv;

/**
 * @Author ws
 * @Date 2021/5/12 22:42
 * @Version 1.0
 */
public class TvOpenCommand extends Command {
    private Tv tv;

    public TvOpenCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.open();
    }
}
