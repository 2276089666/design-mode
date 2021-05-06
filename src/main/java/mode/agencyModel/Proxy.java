package mode.agencyModel;

/**
 * @Author ws
 * @Date 2021/5/6 22:33
 * @Version 1.0
 */
public class Proxy implements Subject{
    private RealSubject realSubject=new RealSubject();

    private void preRequest(){
        System.out.println("preRequest");
    }

    @Override
    public void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void postRequest(){
        System.out.println("postRequest");
    }
}
