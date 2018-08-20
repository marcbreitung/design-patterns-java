package DesignPatterns.Structural.Decorator;

public class Militia implements MilitiaInterface {

    private int armor;

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public void setArmor(int armor) {
        this.armor = armor;
    }
}
