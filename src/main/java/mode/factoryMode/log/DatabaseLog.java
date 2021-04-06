package mode.factoryMode.log;

import mode.factoryMode.Log;

/**
 * @Author ws
 * @Date 2021/4/6 14:59
 * @Version 1.0
 */
public class DatabaseLog implements Log {
    @Override
    public void writeLog() {
        System.out.println("DatabaseLog");
    }
}
