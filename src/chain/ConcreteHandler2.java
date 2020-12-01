package chain;

import java.util.Objects;

/**
 * Description:
 *
 * @author yangshixiong
 * Date 2020/11/30
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String request) {
        System.out.println("I am concrete handle 2, handle -> " + request);
        if (Objects.nonNull(this.getNext())) {
            this.getNext().handleRequest(request);
        } else {
            System.out.println("this is the end 2");
        }
    }
}
