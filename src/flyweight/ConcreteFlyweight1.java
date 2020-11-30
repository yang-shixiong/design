package flyweight;

import java.util.Objects;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ConcreteFlyweight1 implements Flyweight {

    public String key;

    public ConcreteFlyweight1(String key) {
        System.out.println("create ConcreteFlyweight1: " + key);
        this.key = key;
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.println("ConcreteFlyweight1 has been used: " + key);
        System.out.println("unShared is: " + (Objects.nonNull(state) ? state.getInfo() : "nothing"));
    }
}
