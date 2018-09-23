package DesignPatterns.Structural.Decorator;

public abstract class BuildingDecorator implements Building {
    protected Building house;

    public BuildingDecorator(Building house) {
        this.house = house;
    }
}
