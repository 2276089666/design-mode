package mode.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @Author ws
 * @Date 2021/6/1 14:15
 */
public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(new LogProxy());
        enhancer.setSuperclass(RealSubject.class);
        RealSubject realSubject = (RealSubject) enhancer.create();
        realSubject.request();

        enhancer.setSuperclass(RealSubject2.class);
        RealSubject2 realSubject2= (RealSubject2) enhancer.create();
        int play = realSubject2.play();
        System.out.println(play);
    }
}
