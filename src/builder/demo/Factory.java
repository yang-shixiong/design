package builder.demo;

/**
 * 抽象工厂
 */
public abstract class Factory {

    // 创建产品对象
    protected Car car = new Car();

    public abstract void buildWheel();

    public abstract void buildLogo();

    public abstract void buildPrice();

    /**
     * 返回产品对象
     * @return 汽车产品
     */
    public Car getResult(){
        return car;
    }
}
