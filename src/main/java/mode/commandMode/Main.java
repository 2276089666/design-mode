package mode.commandMode;

import mode.commandMode.commandInstance.TvOpenCommand;

/**
 * @Author ws
 * @Date 2021/5/12 22:45
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        // 命令接收者,正真干活的
        Tv tv = new Tv();
        // 具体命令
        TvOpenCommand tvOpenCommand = new TvOpenCommand(tv);
        // 调用者
        Invoker invoker = new Invoker(tvOpenCommand);
        invoker.open();
    }
}
