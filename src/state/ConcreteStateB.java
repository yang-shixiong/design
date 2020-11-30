package state;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("current state is B");
        context.setState(new ConcreteStateA());
    }
}
