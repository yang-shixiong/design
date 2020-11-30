package vistor;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public interface Element {

    void accept(Visitor visitor);
}
