package DesignPatterns.Creational.AbstractFactory;

public class FranksMill implements Mill {

    private int capacity;
    private int cereal;

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void setCereal(int cereal) {
        this.cereal = cereal;
    }

    @Override
    public int getCereal() {
        return cereal;
    }

    @Override
    public double grind() {
        return this.cereal * 0.5;
    }
}
