package proxy;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class Proxy implements Subject {

    private final RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        this.preRequest();
        this.realSubject.request();
        this.postRequest();
    }

    private void preRequest() {
        System.out.println("pre request");
    }

    private void postRequest() {
        System.out.println("post request");
    }
}
