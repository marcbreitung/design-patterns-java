package Unit.DesignPatterns.Creational.FactoryMethod;

import DesignPatterns.Creational.FactoryMethod.BuildingFactory;
import DesignPatterns.Creational.FactoryMethod.MillFactory;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class MillFactoryTest {

    @Test
    public void getBuildingReturnsMill() {
        BuildingFactory buildingFactory = new MillFactory();
        assertThat(buildingFactory.getBuilding(), instanceOf(DesignPatterns.Creational.FactoryMethod.Mill.class));
    }

}
