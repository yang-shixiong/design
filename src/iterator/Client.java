package iterator;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class Client {

    public static void main(String[] args) {
        Aggregate<Integer> aggregate = new ConcreteAggregate<>();
        aggregate.add(1);
        aggregate.add(2);
        aggregate.add(3);
        Iterator<Integer> iterator = aggregate.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("first: " + iterator.first());
        /**
         * 1
         * 2
         * 3
         * first: 1
         */
    }
}
