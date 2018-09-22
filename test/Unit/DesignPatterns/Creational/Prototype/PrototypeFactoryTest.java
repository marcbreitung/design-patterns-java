package Unit.DesignPatterns.Creational.Prototype;

import DesignPatterns.Creational.Prototype.Farmer;
import DesignPatterns.Creational.Prototype.PrototypeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrototypeFactoryTest {

    @Test
    public void constructorInitializesThePrototypes() {
        PrototypeFactory prototypeFactory = new PrototypeFactory();

        Farmer fieldFarmer = prototypeFactory.getFarmer("fieldFarmer");

        assertEquals("Field Farmer", fieldFarmer.getName());
        assertEquals(100, fieldFarmer.getLivePoints());
        assertEquals("Field Tool 1", fieldFarmer.getFarmerTools().get(0).getName());
        assertEquals("Field Tool 2", fieldFarmer.getFarmerTools().get(1).getName());


        Farmer cattleFarmer = prototypeFactory.getFarmer("cattleFarmer");

        assertEquals("Cattle Farmer", cattleFarmer.getName());
        assertEquals(100, cattleFarmer.getLivePoints());
        assertEquals("Cattle Tool 1", cattleFarmer.getFarmerTools().get(0).getName());
        assertEquals("Cattle Tool 2", cattleFarmer.getFarmerTools().get(1).getName());

    }

}
