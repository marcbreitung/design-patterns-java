package DesignPatterns.Creational.AbstractFactory;

public interface Mill {
    void setCapacity(int capacity);

    int getCapacity();

    void setCereal(int cereal);

    int getCereal();

    double grind();
}
