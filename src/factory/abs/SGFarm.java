package factory.abs;

import factory.abs.Farm;
import factory.abs.product.Animal;
import factory.abs.product.Cattle;
import factory.abs.product.Plant;
import factory.abs.product.Vegetable;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/28
 */
public class SGFarm implements Farm {
    @Override
    public Animal newAnimal() {
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        return new Vegetable();
    }
}
