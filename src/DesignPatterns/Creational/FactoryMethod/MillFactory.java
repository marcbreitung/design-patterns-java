package DesignPatterns.Creational.FactoryMethod;

public class MillFactory extends BuildingFactory {

    @Override
    Building createBuilding() {
        return new Mill();
    }
}
