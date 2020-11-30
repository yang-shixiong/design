package proxy.cglib;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class Client {

    public static void main(String[] args) {
        CglibObject cglibObject = new CglibObject();
        ProxyFactory proxyFactory = new ProxyFactory(cglibObject);
        CglibObject instance = (CglibObject) proxyFactory.getInstance();
        instance.request();
        /**
         * pre request
         * i am real object
         * post request
         */
    }
}
