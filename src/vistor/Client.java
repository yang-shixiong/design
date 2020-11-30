package vistor;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class Client {

    public static void main(String[] args) {
        ConcreteElementA concreteElementA = new ConcreteElementA();
        ConcreteElementB concreteElementB = new ConcreteElementB();

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(concreteElementA);
        objectStructure.add(concreteElementB);

        objectStructure.accept(new ConcreteVisitorA());
        objectStructure.accept(new ConcreteVisitorB());
        /**
         * concrete visitorA will operation concrete element A
         * concrete element operation A used
         * concrete visitorA will operation concrete element B
         * concrete element B operation B was used
         * concrete visitorB will operation concrete element A
         * concrete element operation A used
         * concrete visitorB will operation concrete element B
         * concrete element B operation B was used
         */
    }
}
