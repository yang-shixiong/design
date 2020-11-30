package flyweight;

import java.util.Objects;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ConcreteFlyweight2 implements Flyweight {

    public String key;

    public ConcreteFlyweight2(String key) {
        System.out.println("create ConcreteFlyweight2: " + key);
        this.key = key;
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.println("ConcreteFlyweight2 has been used: " + key);
        System.out.println("unShared is: " + (Objects.nonNull(state) ? state.getInfo() : "nothing"));
    }
}
