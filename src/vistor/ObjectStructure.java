package vistor;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ObjectStructure {

    private final List<Element> elementList = new ArrayList<>();

    public void accept(Visitor visitor) {
        elementList.forEach(element -> element.accept(visitor));
    }

    public void add(Element element) {
        elementList.add(element);
    }

    public void remove(Element element) {
        elementList.remove(element);
    }
}
