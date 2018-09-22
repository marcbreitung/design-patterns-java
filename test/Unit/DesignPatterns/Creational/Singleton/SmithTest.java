package Unit.DesignPatterns.Creational.Singleton;

import DesignPatterns.Creational.Singleton.Smith;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmithTest {

    @Test
    public void setNameSetsAttributeName() {
        Smith smith = new Smith();
        smith.setName("Name");
        assertEquals("Name", smith.getName());
    }
}
