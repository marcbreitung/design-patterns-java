package Unit.DesignPatterns.Creational.AbstractFactory;

import DesignPatterns.Creational.AbstractFactory.BuildingsFactory;
import DesignPatterns.Creational.AbstractFactory.FranksBuildingsFactory;
import DesignPatterns.Creational.AbstractFactory.FranksFarm;
import DesignPatterns.Creational.AbstractFactory.FranksMill;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class FranksBuildingsFactoryTest {

    @Test
    public void createFarmReturnsFranksFarm() {
        BuildingsFactory buildingsFactory = new FranksBuildingsFactory();
        assertThat(buildingsFactory.createFarm(), instanceOf(FranksFarm.class));
    }

    @Test
    public void createMillReturnsFranksMill() {
        BuildingsFactory buildingsFactory = new FranksBuildingsFactory();
        assertThat(buildingsFactory.createMill(), instanceOf(FranksMill.class));
    }

}
