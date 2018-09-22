package Unit.DesignPatterns.Creational.Prototype;

import DesignPatterns.Creational.Prototype.Farmer;
import DesignPatterns.Creational.Prototype.FarmerTool;
import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FarmerTest {

    @Test
    public void setNameWithStringSetsTheName() {
        Farmer farmer = new Farmer();
        farmer.setName("Name");
        assertEquals("Name", farmer.getName());
    }

    @Test
    public void setLivePointsWithIntSetsTheAttributeLivePoints() {
        Farmer farmer = new Farmer();
        farmer.setLivePoints(10);
        assertEquals(10, farmer.getLivePoints());
    }

    @Test
    public void addFarmerToolWithFarmerToolAddsFarmerToolToAttributeFarmerTool() {
        Farmer farmer = new Farmer();
        farmer.addFarmerTool(new FarmerTool("Tool 1"));
        farmer.addFarmerTool(new FarmerTool("Tool 2"));

        Vector<FarmerTool> farmerTools = farmer.getFarmerTools();

        assertEquals("Tool 1", farmerTools.get(0).getName());
        assertEquals("Tool 2", farmerTools.get(1).getName());
    }

    @Test
    public void cloneFarmerGeneratesClonedFarmer() {
        Farmer farmer = new Farmer();
        farmer.setName("Name");
        farmer.addFarmerTool(new FarmerTool("Tool 1"));

        Farmer farmerClone = (Farmer) farmer.clone();
        assertEquals("Name", farmerClone.getName());
        assertEquals("Tool 1", farmer.getFarmerTools().get(0).getName());
    }

}
