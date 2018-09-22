package Unit.DesignPatterns.Creational.Singleton;

import DesignPatterns.Creational.Singleton.SettlerSingletonFactory;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SettlerSingletonFactoryTest {

    @Test
    public void getInstanceReturnsTheObjectInstance() {
        SettlerSingletonFactory settlerSingletonFactoryA = SettlerSingletonFactory.getInstance();
        SettlerSingletonFactory settlerSingletonFactoryB = SettlerSingletonFactory.getInstance();
        assertEquals(settlerSingletonFactoryA, settlerSingletonFactoryB);
    }

    @Test
    public void getSmithReturnsNewSmithObject() {
        SettlerSingletonFactory settlerSingletonFactory = SettlerSingletonFactory.getInstance();
        assertThat(settlerSingletonFactory.getSmith(), instanceOf(DesignPatterns.Creational.Singleton.Smith.class));
    }

}