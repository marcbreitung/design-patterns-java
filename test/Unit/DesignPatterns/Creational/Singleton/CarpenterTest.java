package Unit.DesignPatterns.Creational.Singleton;

import DesignPatterns.Creational.Singleton.Carpenter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarpenterTest {

    @Test
    public void setNameSetsAttributeName() {
        Carpenter carpenter = new Carpenter();
        carpenter.setName("Name");
        assertEquals("Name", carpenter.getName());
    }
}
