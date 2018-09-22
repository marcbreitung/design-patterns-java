package Unit.DesignPatterns.Creational.Builder;

import DesignPatterns.Creational.AbstractFactory.BritonsBakery;
import DesignPatterns.Creational.AbstractFactory.BritonsForge;
import DesignPatterns.Creational.Builder.Settlement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class SettlementTest {

    Settlement settlement;

    @BeforeEach
    public void setUp() {
        settlement = new Settlement();
    }

    @Test
    public void setBakeryWithBakerySetsAttributeBakery() {
        settlement.setBakery(new BritonsBakery());
        assertThat(settlement.getBakery(), instanceOf(DesignPatterns.Creational.AbstractFactory.Bakery.class));
    }

    @Test
    public void setForgeWithForgeSetsAttributeForge() {
        settlement.setForge(new BritonsForge());
        assertThat(settlement.getForge(), instanceOf(DesignPatterns.Creational.AbstractFactory.Forge.class));
    }

}
