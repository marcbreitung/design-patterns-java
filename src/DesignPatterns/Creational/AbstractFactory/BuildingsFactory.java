package DesignPatterns.Creational.AbstractFactory;

public interface BuildingsFactory {
    Forge getForge();

    Bakery getBakery();
}
