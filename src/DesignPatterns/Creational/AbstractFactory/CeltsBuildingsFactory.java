package DesignPatterns.Creational.AbstractFactory;

public class CeltsBuildingsFactory implements BuildingsFactory {

    @Override
    public Forge getForge() {
        return new CeltsForge();
    }

    @Override
    public Bakery getBakery() {
        return new CeltsBakery();
    }
}
