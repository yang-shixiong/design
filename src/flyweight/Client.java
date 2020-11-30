package flyweight;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class Client {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight a01 = factory.getFlyweight("a");
        Flyweight a02 = factory.getFlyweight("a");

        Flyweight b01 = factory.getFlyweight("b");
        Flyweight b02 = factory.getFlyweight("b");

        Flyweight c01 = factory.getFlyweight("c");
        Flyweight c02 = factory.getFlyweight("c");

        a01.operation(new UnsharedConcreteFlyweight("first"));
        a02.operation(new UnsharedConcreteFlyweight("second"));

        b01.operation(new UnsharedConcreteFlyweight("first"));
        b02.operation(new UnsharedConcreteFlyweight("second"));

        c01.operation(new UnsharedConcreteFlyweight("first"));
        c02.operation(new UnsharedConcreteFlyweight("second"));
        /**
         * create ConcreteFlyweight2: a
         * create ConcreteFlyweight1: b
         * create ConcreteFlyweight2: c
         * ConcreteFlyweight2 has been used: a
         * unShared is: first
         * ConcreteFlyweight2 has been used: a
         * unShared is: second
         * ConcreteFlyweight1 has been used: b
         * unShared is: first
         * ConcreteFlyweight1 has been used: b
         * unShared is: second
         * ConcreteFlyweight2 has been used: c
         * unShared is: first
         * ConcreteFlyweight2 has been used: c
         * unShared is: second
         */
    }
}
