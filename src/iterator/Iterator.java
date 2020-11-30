package iterator;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public interface Iterator<T> {

    T first();

    T next();

    boolean hasNext();
}
