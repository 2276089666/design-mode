package mode.factoryMode.factory;

import mode.factoryMode.log.DatabaseLog;
import mode.factoryMode.Log;
import mode.factoryMode.LogFactory;

/**
 * @Author ws
 * @Date 2021/4/6 15:03
 * @Version 1.0
 */
public class DatabaseLogFactory extends LogFactory {
    @Override
    public Log createLog() {
        return new DatabaseLog();
    }
}
