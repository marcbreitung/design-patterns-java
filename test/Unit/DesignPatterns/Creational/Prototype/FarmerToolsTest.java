package Unit.DesignPatterns.Creational.Prototype;

import DesignPatterns.Creational.Prototype.FarmerTool;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FarmerToolsTest {

    @Test
    public void constructorWithStringSetsAttributeName() {
        FarmerTool farmerTool = new FarmerTool("scythe");
        assertEquals("scythe", farmerTool.getName());
    }

    @Test
    public void setNameWithStringSetsAttributeName() {
        FarmerTool farmerTool = new FarmerTool();
        farmerTool.setName("scythe");
        assertEquals("scythe", farmerTool.getName());
    }

}
