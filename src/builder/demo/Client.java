package builder.demo;

/**
 * 客户
 */
public class Client {

    public static void main(String[] args) {
        Factory factory;
        // 通过指定的厂商获取具体工厂实例
        factory = (Factory) Util.getObject("BMWFactory");
        // 获取经销商实例
        Agent agent = new Agent(factory);
        // 经销商订货
        Car car = agent.construct();
        // 展示
        car.show();
    }
}
