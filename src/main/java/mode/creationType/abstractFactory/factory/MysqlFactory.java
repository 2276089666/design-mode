package mode.creationType.abstractFactory.factory;

import mode.creationType.abstractFactory.connection.Connection;
import mode.creationType.abstractFactory.DBFactory;
import mode.creationType.abstractFactory.statement.Statement;
import mode.creationType.abstractFactory.connection.MysqlConnection;
import mode.creationType.abstractFactory.statement.MysqlStatement;

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
