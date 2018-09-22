package Unit.DesignPatterns.Creational.AbstractFactory;

import DesignPatterns.Creational.AbstractFactory.Bakery;
import DesignPatterns.Creational.AbstractFactory.BritonsBakery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BritonsBakeryTest {

    private Bakery bakery;

    @BeforeEach
    public void setUp() {
        bakery = new BritonsBakery();
    }

    @Test
    public void setIdWithStringSetsTheAttributeId() {
        bakery.setId("forge 1");
        assertEquals("forge 1", bakery.getId());
    }

    @Test
    public void setResidentsIntWithIntSetsTheAttributeResidentsNumber() {
        bakery.setResidentsNumber(5);
        assertEquals(5, bakery.getResidentsNumber());
    }

    @Test
    public void setFlourStockWithIntSetsTheAttributeIronFlour() {
        bakery.setFlourStock(5);
        assertEquals(5, bakery.getFlourStock());
    }

    @Test
    public void bakeBreadsWithIntAndSufficientFlourReturnsNumberOfBakedBreads() {
        bakery.setFlourStock(5);
        assertEquals(2, bakery.bakeBreads(2));
        assertEquals(1, bakery.getFlourStock());
    }

    @Test
    public void bakeBreadsWithIntAndInsufficientFlourReturnsNumberOfBakedBreads() {
        bakery.setFlourStock(1);
        assertEquals(0, bakery.bakeBreads(1));
        assertEquals(1, bakery.getFlourStock());
    }

}
