package adapter.adapterObject;


/**
 * 适配器 实现目标接口
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    /**
     * 构造函数，接受适配者对象，初始化
     * @param adaptee 适配者对象
     */
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("来到了适配器接口，我要去调用适配者");
        // 调用适配者对象的方法，无需知道其内部构造
        adaptee.specificRequest();
        System.out.println("调用适配者结束");
    }

}
