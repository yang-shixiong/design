package mediator;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class Client {

    public static void main(String[] args) {
        Mediator concreteMediator = new ConcreteMediator();
        Colleague concreteColleague1 = new ConcreteColleague1();
        Colleague concreteColleague2 = new ConcreteColleague2();
        concreteMediator.register(concreteColleague1);
        concreteMediator.register(concreteColleague2);
        concreteColleague1.send();
        concreteColleague2.send();
        /**
         * concrete colleague1 send request
         * concrete colleague2 receive request
         * concrete colleague2 send request
         * concrete colleague1 receive request
         */
    }
}
