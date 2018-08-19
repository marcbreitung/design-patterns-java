package Unit.DesignPatterns.Creational.AbstractFactory;

import DesignPatterns.Creational.AbstractFactory.*;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class BritonsBuildingsFactoryTest {

    @Test
    public void createFarmReturnsFranksFarm() {
        BuildingsFactory buildingsFactory = new BritonsBuildingsFactory();
        assertThat(buildingsFactory.createFarm(), instanceOf(BritonsFarm.class));
    }

    @Test
    public void createMillReturnsFranksMill() {
        BuildingsFactory buildingsFactory = new BritonsBuildingsFactory();
        assertThat(buildingsFactory.createMill(), instanceOf(BritonsMill.class));
    }

}
