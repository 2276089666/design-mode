package mode.abstractFactory.factory;

import mode.abstractFactory.connection.Connection;
import mode.abstractFactory.DBFactory;
import mode.abstractFactory.statement.Statement;
import mode.abstractFactory.connection.OracleConnection;
import mode.abstractFactory.statement.OracleStatement;

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
