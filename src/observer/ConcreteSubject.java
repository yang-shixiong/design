package observer;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ConcreteSubject extends Subject {
    @Override
    protected void notifyObserver() {
        observers.forEach(Observer::response);
    }
}
