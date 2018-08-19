package DesignPatterns.Creational.AbstractFactory;

public class BritonsBuildingsFactory implements BuildingsFactory {

    @Override
    public Farm createFarm() {
        return new BritonsFarm();
    }

    @Override
    public Mill createMill() {
        return new BritonsMill();
    }
}
