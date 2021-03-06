package DesignPatterns.Creational.AbstractFactory;

public class BritonsBuildingsFactory implements BuildingsFactory {

    @Override
    public Forge getForge() {
        return new BritonsForge();
    }

    @Override
    public Bakery getBakery() {
        return new BritonsBakery();
    }
}
