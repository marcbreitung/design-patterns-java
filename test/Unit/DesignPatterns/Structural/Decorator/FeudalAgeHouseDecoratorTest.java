package Unit.DesignPatterns.Structural.Decorator;

import DesignPatterns.Structural.Decorator.BuildingDecorator;
import DesignPatterns.Structural.Decorator.FeudalAgeHouseDecorator;
import DesignPatterns.Structural.Decorator.House;
import DesignPatterns.Structural.Decorator.Building;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeudalAgeHouseDecoratorTest {


    @Test
    public void setHitPointsSetsTheAttributeHitPointsWith() {
        Building house = new House();
        house.setHitPoints(400);
        BuildingDecorator feudalAgeHouseDecorator = new FeudalAgeHouseDecorator(house);
        assertEquals(400, feudalAgeHouseDecorator.getHitPoints());
    }

    @Test
    public void hitWithIntDecreasesTheValueHitPoints() {
        Building house = new House();
        house.setHitPoints(400);
        BuildingDecorator feudalAgeHouseDecorator = new FeudalAgeHouseDecorator(house);
        feudalAgeHouseDecorator.hit(200);
        assertEquals(350, feudalAgeHouseDecorator.getHitPoints());
    }

}
