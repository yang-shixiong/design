package vistor;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public interface Visitor {

    void visit(ConcreteElementA concreteElementA);

    void visit(ConcreteElementB concreteElementB);
}