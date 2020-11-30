package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    protected abstract void notifyObserver();
}
