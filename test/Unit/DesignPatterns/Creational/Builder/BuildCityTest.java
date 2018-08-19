package Unit.DesignPatterns.Creational.Builder;

import DesignPatterns.Creational.Builder.City;
import DesignPatterns.Creational.Builder.CityBuilder;
import DesignPatterns.Creational.Builder.SettlementDirector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildCityTest {

    @Test
    public void buildCityCreatesCityWithMillAndFarm() {
        SettlementDirector settlementDirector = new SettlementDirector();
        City city = settlementDirector.build(new CityBuilder());
        assertEquals(1, city.getNumberOfMills());
        assertEquals(1, city.getNumberOfFarms());
    }
}
