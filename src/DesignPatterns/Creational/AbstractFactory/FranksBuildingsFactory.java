package DesignPatterns.Creational.AbstractFactory;

public class FranksBuildingsFactory implements BuildingsFactory {

    @Override
    public Farm createFarm() {
        return new FranksFarm();
    }

    @Override
    public Mill createMill() {
        return new FranksMill();
    }
}
