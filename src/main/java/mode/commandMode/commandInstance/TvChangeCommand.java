package mode.commandMode.commandInstance;

import mode.commandMode.Command;
import mode.commandMode.Tv;

/**
 * @Author ws
 * @Date 2021/5/12 22:43
 * @Version 1.0
 */
public class TvChangeCommand extends Command {
    private Tv tv;

    public TvChangeCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.change();
    }
}
