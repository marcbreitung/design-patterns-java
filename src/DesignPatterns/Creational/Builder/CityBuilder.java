package DesignPatterns.Creational.Builder;

import DesignPatterns.Creational.AbstractFactory.Farm;
import DesignPatterns.Creational.AbstractFactory.FranksFarm;
import DesignPatterns.Creational.AbstractFactory.FranksMill;

public class CityBuilder {

    protected City city;

    public void createCity() {
        this.city = new City();
    }

    public void addFarm() {
        this.city.addFarm(new FranksFarm());
    }

    public void addMill() {
        this.city.addMill(new FranksMill());
    }

    public City getCity() {
        return this.city;
    }
}
