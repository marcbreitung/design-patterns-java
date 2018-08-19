package Unit.DesignPatterns.Creational.AbstractFactory;

import DesignPatterns.Creational.AbstractFactory.BritonsFarm;
import DesignPatterns.Creational.AbstractFactory.Farm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BritonsFarmTest {

    @Test
    public void setFieldAreaWithXAndYSetsAttributeSquareMetre() {
        Farm farm = new BritonsFarm();
        farm.setFieldArea(5, 5);
        assertEquals(25, farm.getFieldArea());
    }

    @Test
    public void harvestReturnsCerealBasedOnTheSquareMetre() {
        Farm farm = new BritonsFarm();
        farm.setFieldArea(5, 5);
        assertEquals(50, farm.harvest());
    }

}
