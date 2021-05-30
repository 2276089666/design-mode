package mode.abstractFactory;

import mode.abstractFactory.connection.Connection;
import mode.abstractFactory.factory.MysqlFactory;
import mode.abstractFactory.statement.Statement;

/**
 * @Author ws
 * @Date 2021/4/6 15:06
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        DBFactory dbFactory = new MysqlFactory();
        // 如果我们需要更换产品簇，只需更换工厂就行
//        DBFactory dbFactory = new OracleFactory();
        Connection connection = dbFactory.createConnection();
        Statement statement = dbFactory.createStatement();
        connection.getConnection();
        statement.getStatement();



    }
}
