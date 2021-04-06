package mode.factoryMode.log;


import mode.factoryMode.Log;


/**
 * @Author ws
 * @Date 2021/4/6 13:53
 * @Version 1.0
 */
public class FileLog implements Log {
    @Override
    public void writeLog() {
        System.out.println("file Log");
    }
}
