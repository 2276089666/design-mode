package mode.factoryMode;

import mode.factoryMode.factory.FileLogFactory;

/**
 * @Author ws
 * @Date 2021/4/6 15:06
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        LogFactory logFactory= new FileLogFactory();
        Log log = logFactory.createLog();
        log.writeLog();
    }
}
