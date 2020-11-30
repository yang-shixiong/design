package proxy.dynamic;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class Client {

    public static void main(String[] args) {
        DynamicSubject dynamicRealSubject = new DynamicRealSubject();
        ProxyFactory proxyFactory = new ProxyFactory(dynamicRealSubject);
        DynamicSubject dynamicSubject = (DynamicSubject) proxyFactory.getInstant();
        dynamicSubject.request();
        /**
         * pre request
         * real request
         * post request
         */
    }
}
