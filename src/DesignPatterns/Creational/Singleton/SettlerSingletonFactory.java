package DesignPatterns.Creational.Singleton;

import DesignPatterns.Creational.Prototype.Farmer;

public class SettlerSingletonFactory {

    private static SettlerSingletonFactory instance = new SettlerSingletonFactory();

    private SettlerSingletonFactory() {
    }

    public static SettlerSingletonFactory getInstance() {
        return instance;
    }

    public Smith getSmith() {
        return new Smith();
    }

    public Carpenter getCarpenter() {
        return new Carpenter();
    }
}
