package mode.abstractFactory.factory;

import mode.abstractFactory.connection.Connection;
import mode.abstractFactory.DBFactory;
import mode.abstractFactory.statement.Statement;
import mode.abstractFactory.connection.MysqlConnection;
import mode.abstractFactory.statement.MysqlStatement;

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
