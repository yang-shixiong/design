package iterator;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public interface Aggregate<T> {

    void add(T object);

    void remove(T object);

    Iterator<T> getIterator();
}
