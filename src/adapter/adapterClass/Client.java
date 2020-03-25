package adapter.adapterClass;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        // 这里制作了一个适配器，因此不使用根据名称来实例话类，直接实例话
        Target target = new Adapter();
        // 调用接口
        target.request();
    }
}
