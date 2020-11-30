package vistor;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationB() {
        System.out.println("concrete element B operation B was used");
    }
}
