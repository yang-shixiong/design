package proxy;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
        /**
         * pre request
         * real request
         * post request
         */
    }
}
