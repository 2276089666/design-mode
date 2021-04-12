package mode.factoryMode.factory;

import mode.factoryMode.connection.Connection;
import mode.factoryMode.DBFactory;
import mode.factoryMode.statement.Statement;
import mode.factoryMode.connection.OracleConnection;
import mode.factoryMode.statement.OracleStatement;

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
