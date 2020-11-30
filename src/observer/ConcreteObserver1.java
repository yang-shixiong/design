package observer;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ConcreteObserver1 implements Observer {
    @Override
    public void response() {
        System.out.println("concrete observer1 update state");
    }
}
