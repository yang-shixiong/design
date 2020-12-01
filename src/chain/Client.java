package chain;

/**
 * Description:
 *
 * @author yangshixiong
 * Date 2020/11/30
 */
public class Client {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        handler1.handleRequest("request");
        /**
         * I am concrete handle 1, handle -> request
         * I am concrete handle 2, handle -> request
         * this is the end 2
         */
    }
}
