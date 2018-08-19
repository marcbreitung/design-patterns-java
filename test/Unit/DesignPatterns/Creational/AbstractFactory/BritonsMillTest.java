package Unit.DesignPatterns.Creational.AbstractFactory;

import DesignPatterns.Creational.AbstractFactory.BritonsMill;
import DesignPatterns.Creational.AbstractFactory.Mill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BritonsMillTest {

    @Test
    public void setCapacityWithIntSetsAttributeCapacity() {
        Mill mill = new BritonsMill();
        mill.setCapacity(10);
        assertEquals(10, mill.getCapacity());
    }

    @Test
    public void setCerealWithIntSetsAttributeCereal() {
        Mill mill = new BritonsMill();
        mill.setCereal(10);
        assertEquals(10, mill.getCereal());
    }

    @Test
    public void grindRetrunsFlour() {
        Mill mill = new BritonsMill();
        mill.setCereal(10);
        assertEquals(8.0, mill.grind());
    }
}