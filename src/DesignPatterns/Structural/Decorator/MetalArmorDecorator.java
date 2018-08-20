package DesignPatterns.Structural.Decorator;

public class MetalArmorDecorator extends ArmorDecorator {

    public MetalArmorDecorator(MilitiaInterface militiaInterface) {
        super(militiaInterface);
    }

    public int getArmor() {
        return this.militiaInterface.getArmor() * 2;
    }

    public void setArmor(int armor) {
        this.militiaInterface.setArmor(armor);
    }
}
