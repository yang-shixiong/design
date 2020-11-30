package mediator;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public interface Mediator {

    void register(Colleague colleague);

    void relay(Colleague colleague);
}
