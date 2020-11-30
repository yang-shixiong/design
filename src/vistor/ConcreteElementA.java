package vistor;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationA() {
        System.out.println("concrete element operation A used");
    }
}
