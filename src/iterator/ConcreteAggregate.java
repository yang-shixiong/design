package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

    private final List<T> list = new ArrayList<>();

    @Override
    public void add(T object) {
        list.add(object);
    }

    @Override
    public void remove(T object) {
        list.remove(object);
    }

    @Override
    public Iterator<T> getIterator() {
        return new ConcreteIterator<>(list);
    }
}
