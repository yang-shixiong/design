package adapter.adapterClass;

/**
 * 适配器 继承适配者并且实现目标接口
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        System.out.println("来到了适配器接口，我要去调用适配者");
        specificRequest();
        System.out.println("调用适配者结束");
    }
}
