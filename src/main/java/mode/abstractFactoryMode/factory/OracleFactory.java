package mode.abstractFactoryMode.factory;

import mode.abstractFactoryMode.connection.Connection;
import mode.abstractFactoryMode.DBFactory;
import mode.abstractFactoryMode.statement.Statement;
import mode.abstractFactoryMode.connection.OracleConnection;
import mode.abstractFactoryMode.statement.OracleStatement;

/**
 * @Author ws
 * @Date 2021/4/12 16:22
 * @Version 1.0
 */
public class OracleFactory implements DBFactory {
    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

    @Override
    public Statement createStatement() {
        return new OracleStatement();
    }
}
