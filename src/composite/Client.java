package composite;

/**
 * Description:
 *
 * @author yangshixiong
 * Date 2020/11/29
 */
public class Client {

    public static void main(String[] args) {
        Leaf leafA = new Leaf("leafA");
        Leaf leafB = new Leaf("leafB");

        Composite compositeA = new Composite("compositeA");
        Composite compositeB = new Composite("compositeB");
        compositeA.add(leafA);
        compositeB.add(leafB);
        Composite compositeC = new Composite("compositeC");
        compositeC.add(compositeA);
        compositeC.add(compositeB);

        compositeC.operation();

        /**
         * this is composite, name : compositeC
         * this is composite, name : compositeA
         * this is leaf, name: leafA
         * this is composite, name : compositeB
         * this is leaf, name: leafB
         */

    }
}
