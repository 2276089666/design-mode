package mode.creationType.abstractFactory.factory;

import mode.creationType.abstractFactory.connection.Connection;
import mode.creationType.abstractFactory.DBFactory;
import mode.creationType.abstractFactory.statement.Statement;
import mode.creationType.abstractFactory.connection.OracleConnection;
import mode.creationType.abstractFactory.statement.OracleStatement;

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
