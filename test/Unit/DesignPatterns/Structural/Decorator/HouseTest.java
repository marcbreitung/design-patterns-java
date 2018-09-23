package Unit.DesignPatterns.Structural.Decorator;

import DesignPatterns.Structural.Decorator.House;
import DesignPatterns.Structural.Decorator.Building;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseTest {

    @Test
    public void setHitPointsSetsTheAttributeHitPoints() {
        Building house = new House();
        house.setHitPoints(550);
        assertEquals(550, house.getHitPoints());
    }

    @Test
    public void hitWithIntDecreasesTheValueHitPoints() {
        Building house = new House();
        house.setHitPoints(500);
        house.hit(200);
        assertEquals(400, house.getHitPoints());
    }

}
