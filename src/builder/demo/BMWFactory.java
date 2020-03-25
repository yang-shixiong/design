package builder.demo;

/**
 * 宝马工厂
 */
public class BMWFactory extends Factory {
    @Override
    public void buildWheel() {
        car.setWheel("4");
    }

    @Override
    public void buildLogo() {
        car.setLogo("BMW");
    }

    @Override
    public void buildPrice() {
        car.setPrice("40");
    }
}
