package DesignPatterns.Creational.AbstractFactory;

public interface Forge {
    int getResidentsNumber();

    void setResidentsNumber(int residentsNumber);

    String getId();

    void setId(String id);

    int getIronStock();

    void setIronStock(int ironStock);

    String forgeTool(String tool);
}
