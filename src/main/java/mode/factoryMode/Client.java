package mode.factoryMode;

import mode.factoryMode.connection.Connection;
import mode.factoryMode.factory.MysqlFactory;
import mode.factoryMode.factory.OracleFactory;
import mode.factoryMode.statement.Statement;

/**
 * @Author ws
 * @Date 2021/4/6 15:06
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        DBFactory mysqlFactory = new MysqlFactory();
        Connection connection = mysqlFactory.createConnection();
        connection.getConnection();

        DBFactory oracleFactory = new OracleFactory();
        Statement statement = oracleFactory.createStatement();
        statement.getStatement();
    }
}
