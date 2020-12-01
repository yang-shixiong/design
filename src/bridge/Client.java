package bridge;

/**
 * Description:
 *
 * @author yangshixiong
 * Date 2020/11/29
 */
public class Client {
    public static void main(String[] args) {
        Implementor implementorA = new ConcreteImplementorA();
        Implementor implementorB = new ConcreteImplementorB();

        RefinedAbstraction abstractionA = new RefinedAbstraction(implementorA);
        RefinedAbstraction abstractionB = new RefinedAbstraction(implementorB);

        abstractionA.operation();
        System.out.println("---------");
        abstractionB.operation();
        /**
         * RefinedAbstraction, if there needs, the could be more RefinedAbstraction
         * ConcreteImplementorA
         * ---------
         * RefinedAbstraction, if there needs, the could be more RefinedAbstraction
         * ConcreteImplementorB
         */
    }
}
