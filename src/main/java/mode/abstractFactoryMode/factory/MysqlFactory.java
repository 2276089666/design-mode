package mode.abstractFactoryMode.factory;

import mode.abstractFactoryMode.connection.Connection;
import mode.abstractFactoryMode.DBFactory;
import mode.abstractFactoryMode.statement.Statement;
import mode.abstractFactoryMode.connection.MysqlConnection;
import mode.abstractFactoryMode.statement.MysqlStatement;

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
