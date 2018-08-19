package DesignPatterns.Creational.Builder;

import DesignPatterns.Creational.AbstractFactory.Farm;
import DesignPatterns.Creational.AbstractFactory.Mill;

import java.util.ArrayList;

public class City {

    private ArrayList<Mill> mills;
    private ArrayList<Farm> farms;

    public City() {
        this.mills = new ArrayList<>();
        this.farms = new ArrayList<>();
    }

    public int getNumberOfMills() {
        return this.mills.size();
    }

    public int getNumberOfFarms() {
        return this.farms.size();
    }

    public void addFarm(Farm farm) {
        this.farms.add(farm);
    }

    public void addMill(Mill mill) {
        this.mills.add(mill);
    }
}
