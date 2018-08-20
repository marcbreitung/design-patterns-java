package Unit.DesignPatterns.Structural.Decorator;

import DesignPatterns.Structural.Decorator.ArmorDecorator;
import DesignPatterns.Structural.Decorator.MetalArmorDecorator;
import DesignPatterns.Structural.Decorator.Militia;
import DesignPatterns.Structural.Decorator.MilitiaInterface;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MilitiaDecoratorTest {

    @Test
    public void metalArmorDecoratorAddsStrongerArmor() {

        MilitiaInterface militiaInterface = new Militia();
        militiaInterface.setArmor(10);

        ArmorDecorator armorDecorator = new MetalArmorDecorator(militiaInterface);
        ArmorDecorator doubleArmorDecorator = new MetalArmorDecorator(armorDecorator);

        assertEquals(10, militiaInterface.getArmor());
        assertEquals(20, armorDecorator.getArmor());
        assertEquals(40, doubleArmorDecorator.getArmor());
    }

}
