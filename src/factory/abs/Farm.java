package factory.abs;

import factory.abs.product.Animal;
import factory.abs.product.Plant;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/28
 */
public interface Farm {

    Animal newAnimal();

    Plant newPlant();
}
