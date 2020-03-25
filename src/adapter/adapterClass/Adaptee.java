package adapter.adapterClass;

/**
 * 适配者 也就是现存的接口
 */
public class Adaptee {

    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用啦～");
    }
}
