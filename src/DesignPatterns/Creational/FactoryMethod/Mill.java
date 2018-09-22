package DesignPatterns.Creational.FactoryMethod;

public class Mill implements Building {

    private String id;
    private int residentsNumber;

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setResidentsNumber(int residentsNumber) {
        this.residentsNumber = residentsNumber;
    }

    @Override
    public int getResidentsNumber() {
        return residentsNumber;
    }
}
