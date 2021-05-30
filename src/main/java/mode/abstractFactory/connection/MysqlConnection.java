package mode.abstractFactory.connection;

/**
 * @Author ws
 * @Date 2021/4/12 16:15
 * @Version 1.0
 */
public class MysqlConnection implements Connection {
    public MysqlConnection() {
        System.out.println("MysqlConnection");
    }

    @Override
    public void getConnection() {

    }
}
