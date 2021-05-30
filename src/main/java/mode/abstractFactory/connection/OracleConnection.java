package mode.abstractFactory.connection;

/**
 * @Author ws
 * @Date 2021/4/12 16:14
 * @Version 1.0
 */
public class OracleConnection implements Connection {
    public OracleConnection() {
        System.out.println("OracleConnection");
    }

    @Override
    public void getConnection() {

    }
}
