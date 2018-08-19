package Unit.DesignPatterns.Creational.AbstractFactory;

import DesignPatterns.Creational.AbstractFactory.FranksMill;
import DesignPatterns.Creational.AbstractFactory.Mill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FranksMillTest {

    @Test
    public void setCapacityWithIntSetsAttributeCapacity() {
        Mill mill = new FranksMill();
        mill.setCapacity(10);
        assertEquals(10, mill.getCapacity());
    }

    @Test
    public void setCerealWithIntSetsAttributeCereal() {
        Mill mill = new FranksMill();
        mill.setCereal(10);
        assertEquals(10, mill.getCereal());
    }

    @Test
    public void grindRetrunsFlour() {
        Mill mill = new FranksMill();
        mill.setCereal(10);
        assertEquals(5.0, mill.grind());
    }
}