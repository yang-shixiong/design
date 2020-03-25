package builder.module;

public class Client {
    public static void main(String[] args) {
        // 使用具体的建造者
        Builder builder = new ConcreteBuilder();
        // 指挥者实例话，指定具体的建造着
        Director director = new Director(builder);
        // 通过指挥者根据对应的具体构建者创建产品
        Product product = director.construct();
        // 展示产品
        product.show();
    }
}
