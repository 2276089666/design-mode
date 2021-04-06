package mode.factoryMode.factory;

import mode.factoryMode.log.FileLog;
import mode.factoryMode.Log;
import mode.factoryMode.LogFactory;

/**
 * @Author ws
 * @Date 2021/4/6 15:01
 * @Version 1.0
 */
public class FileLogFactory extends LogFactory {
    @Override
    public Log createLog() {
        return new FileLog();
    }
}
