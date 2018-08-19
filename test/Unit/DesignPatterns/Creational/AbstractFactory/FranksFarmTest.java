package Unit.DesignPatterns.Creational.AbstractFactory;

import DesignPatterns.Creational.AbstractFactory.Farm;
import DesignPatterns.Creational.AbstractFactory.FranksFarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FranksFarmTest {

    @Test
    public void setFieldAreaWithXAndYSetsAttributeSquareMetre() {
        Farm farm = new FranksFarm();
        farm.setFieldArea(5, 5);
        assertEquals(25, farm.getFieldArea());
    }

    @Test
    public void harvestReturnsCerealBasedOnTheSquareMetre() {
        Farm farm = new FranksFarm();
        farm.setFieldArea(5, 5);
        assertEquals(75, farm.harvest());
    }

}
