package proxy;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("real request");
    }
}
