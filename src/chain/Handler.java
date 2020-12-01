package chain;

/**
 * Description:
 *
 * @author yangshixiong
 * Date 2020/11/30
 */
public abstract class Handler {

    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);
}
