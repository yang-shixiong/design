package observer;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class Client {
    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();
        subject.add(new ConcreteObserver1());
        subject.add(new ConcreteObserver2());
        subject.notifyObserver();
        /**
         * concrete observer1 update state
         * concrete observer2 update state
         */
    }
}
