package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class FlyweightFactory {

    private final Map<String, Flyweight> flyweights = new HashMap<>();

    private int count = 0;

    public Flyweight getFlyweight(String key) {
        if (!flyweights.containsKey(key)) {
            synchronized (this) {
                if (!flyweights.containsKey(key)) {
                    // 这里取决于业务场景
                    flyweights.put(key, count % 2 == 1 ? new ConcreteFlyweight1(key) : new ConcreteFlyweight2(key));
                    count++;
                }
            }
        }
        return flyweights.get(key);
    }
}
