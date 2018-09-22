package Unit.DesignPatterns.Creational.AbstractFactory;

import DesignPatterns.Creational.AbstractFactory.Forge;
import DesignPatterns.Creational.AbstractFactory.CeltsForge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CeltsForgeTest {

    private Forge forge;

    @BeforeEach
    public void setUp() {
        forge = new CeltsForge();
    }

    @Test
    public void setIdWithStringSetsTheAttributeId() {
        forge.setId("forge 1");
        assertEquals("forge 1", forge.getId());
    }

    @Test
    public void setResidentsIntWithIntSetsTheAttributeResidentsNumber() {
        forge.setResidentsNumber(5);
        assertEquals(5, forge.getResidentsNumber());
    }

    @Test
    public void setIronStockWithIntSetsTheAttributeIronStock() {
        forge.setIronStock(5);
        assertEquals(5, forge.getIronStock());
    }

    @Test
    public void forgeToolWithStringAndSufficientIronReturnsTheToolAsString() {
        forge.setIronStock(10);
        assertEquals("plier", forge.forgeTool("plier"));
        assertEquals(0, forge.getIronStock());
    }

    @Test
    public void forgeToolWithStringAndInsufficientIronReturnsEmptyString() {
        forge.setIronStock(5);
        assertEquals("", forge.forgeTool("plier"));
        assertEquals(5, forge.getIronStock());
    }

}
