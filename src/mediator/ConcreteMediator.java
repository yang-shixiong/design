package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ConcreteMediator implements Mediator {

    private final List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        colleagues.add(colleague);
        colleague.setMediator(this);
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague colleague1 : colleagues) {
            if (!colleague1.equals(colleague)) {
                colleague1.receive();
            }
        }
    }
}
