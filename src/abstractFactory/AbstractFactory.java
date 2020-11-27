package abstractFactory;

/**
 * 抽象工厂 定义生产抽象产品 1 2 接口
 */
public interface AbstractFactory {

    /**
     * 产品1
     *
     * @return 产品实例1
     */
    Product1 newProduct1();

    /**
     * 产品2
     *
     * @return 产品实例2
     */
    Product2 newProduce2();

}
