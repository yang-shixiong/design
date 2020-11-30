package observer;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ConcreteObserver2 implements Observer {
    @Override
    public void response() {
        System.out.println("concrete observer2 update state");
    }
}
