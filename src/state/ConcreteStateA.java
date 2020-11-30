package state;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        System.out.println("current state is A");

        context.setState(new ConcreteStateB());
    }
}
