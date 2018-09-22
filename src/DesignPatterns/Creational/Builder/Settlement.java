package DesignPatterns.Creational.Builder;

import DesignPatterns.Creational.AbstractFactory.Bakery;
import DesignPatterns.Creational.AbstractFactory.Forge;

public class Settlement {

    private Bakery bakery;
    private Forge forge;

    public void setBakery(Bakery bakery) {
        this.bakery = bakery;
    }

    public Bakery getBakery() {
        return bakery;
    }

    public void setForge(Forge forge) {
        this.forge = forge;
    }

    public Forge getForge() {
        return forge;
    }
}
