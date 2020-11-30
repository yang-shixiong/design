package vistor;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ConcreteVisitorA implements Visitor {

    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("concrete visitorA will operation concrete element A");
        concreteElementA.operationA();
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("concrete visitorA will operation concrete element B");
        concreteElementB.operationB();
    }
}
