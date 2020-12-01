package decorate;

/**
 * Description:
 *
 * @author yangshixiong
 * Date 2020/11/29
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component decorateA = new ConcreteDecorateA(component);
        Component decorateB = new ConcreteDecorateB(decorateA);
        decorateB.operation();
        /**
         * this add function in concrete decorator B
         * i am concrete component
         * add function in concrete decorate A
         */
    }
}
