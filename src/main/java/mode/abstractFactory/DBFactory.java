package mode.abstractFactory;

import mode.abstractFactory.connection.Connection;
import mode.abstractFactory.statement.Statement;

/**
 * @Author ws
 * @Date 2021/4/12 16:19
 * @Version 1.0
 */
public interface DBFactory {
    Connection createConnection();
    Statement createStatement();
}
