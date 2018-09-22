package DesignPatterns.Creational.FactoryMethod;

public abstract class BuildingFactory {

    public Building getBuilding() {
        return this.createBuilding();
    }

    abstract Building createBuilding();
}
