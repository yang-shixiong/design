package factory.abs;

import factory.abs.product.Animal;
import factory.abs.product.Fruit;
import factory.abs.product.Horse;
import factory.abs.product.Plant;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/28
 */
public class SRFarm implements Farm {
    @Override
    public Animal newAnimal() {
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        return new Fruit();
    }
}
