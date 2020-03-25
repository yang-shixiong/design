package adapter.adapterObject;


/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        // 实例化适配者对象
        Adaptee adaptee = new Adaptee();
        // 构建目标，并将适配者对象传入
        Target target = new Adapter(adaptee);
        // 调用接口
        target.request();
    }
}
