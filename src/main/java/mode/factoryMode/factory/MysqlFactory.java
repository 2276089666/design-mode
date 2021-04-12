package mode.factoryMode.factory;

import mode.factoryMode.connection.Connection;
import mode.factoryMode.DBFactory;
import mode.factoryMode.statement.Statement;
import mode.factoryMode.connection.MysqlConnection;
import mode.factoryMode.statement.MysqlStatement;

/**
 * @Author ws
 * @Date 2021/4/12 16:19
 * @Version 1.0
 */
public class MysqlFactory implements DBFactory {
    @Override
    public Connection createConnection() {
        return new MysqlConnection();
    }

    @Override
    public Statement createStatement() {
        return new MysqlStatement();
    }
}
