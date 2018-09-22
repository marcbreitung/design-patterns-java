package DesignPatterns.Creational.AbstractFactory;

public interface Bakery {
    String getId();

    void setId(String id);

    int getResidentsNumber();

    void setResidentsNumber(int residentsNumber);

    int getFlourStock();

    void setFlourStock(int flourStock);

    int bakeBreads(int breads);
}
