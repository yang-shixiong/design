package iterator;

import java.util.List;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private final List<T> list;

    private int index = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public T first() {
        return list.get(0);
    }

    @Override
    public T next() {
        return list.get(index++);
    }

    @Override
    public boolean hasNext() {
        return list.size() > index;
    }
}
