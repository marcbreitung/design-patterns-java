package Unit.DesignPatterns.Creational.FactoryMethod;

import DesignPatterns.Creational.FactoryMethod.Building;
import DesignPatterns.Creational.FactoryMethod.Mill;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MillTest {

    private Building mill;

    @BeforeEach
    public void setUp() {
        mill = new Mill();
    }

    @Test
    public void setIdWithStringSetsTheAttributeId() {
        mill.setId("forge 1");
        assertEquals("forge 1", mill.getId());
    }

    @Test
    public void setResidentsIntWithIntSetsTheAttributeResidentsNumber() {
        mill.setResidentsNumber(5);
        assertEquals(5, mill.getResidentsNumber());
    }

}
