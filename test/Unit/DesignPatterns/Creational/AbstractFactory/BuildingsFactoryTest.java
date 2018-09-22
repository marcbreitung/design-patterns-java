package Unit.DesignPatterns.Creational.AbstractFactory;

import DesignPatterns.Creational.AbstractFactory.BritonsBuildingsFactory;
import DesignPatterns.Creational.AbstractFactory.BuildingsFactory;
import DesignPatterns.Creational.AbstractFactory.CeltsBuildingsFactory;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class BuildingsFactoryTest {

    @Test
    public void getForgeWithBritonsFactoryReturnsBritonsForge() {
        BuildingsFactory buildingsFactory = new BritonsBuildingsFactory();
        assertThat(buildingsFactory.getForge(), instanceOf(DesignPatterns.Creational.AbstractFactory.BritonsForge.class));
    }

    @Test
    public void getBakeryWithBritonsFactoryReturnsBritonsBakery() {
        BuildingsFactory buildingsFactory = new BritonsBuildingsFactory();
        assertThat(buildingsFactory.getBakery(), instanceOf(DesignPatterns.Creational.AbstractFactory.BritonsBakery.class));
    }

    @Test
    public void getForgeWithCeltsFactoryReturnsCeltsForge() {
        BuildingsFactory buildingsFactory = new CeltsBuildingsFactory();
        assertThat(buildingsFactory.getForge(), instanceOf(DesignPatterns.Creational.AbstractFactory.CeltsForge.class));
    }

    @Test
    public void getBakeryWithCeltsFactoryReturnsCeltsBakery() {
        BuildingsFactory buildingsFactory = new CeltsBuildingsFactory();
        assertThat(buildingsFactory.getBakery(), instanceOf(DesignPatterns.Creational.AbstractFactory.CeltsBakery.class));
    }
}
