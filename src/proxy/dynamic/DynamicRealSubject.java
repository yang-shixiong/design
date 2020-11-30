package proxy.dynamic;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class DynamicRealSubject implements DynamicSubject {
    @Override
    public void request() {
        System.out.println("real request");
    }
}
