package DesignPatterns.Creational.AbstractFactory;

public class CeltsForge implements Forge {

    private String id;

    private int residentsNumber;
    private int ironStock;

    @Override
    public int getResidentsNumber() {
        return residentsNumber;
    }

    @Override
    public void setResidentsNumber(int residentsNumber) {
        this.residentsNumber = residentsNumber;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int getIronStock() {
        return ironStock;
    }

    @Override
    public void setIronStock(int ironStock) {
        this.ironStock = ironStock;
    }

    @Override
    public String forgeTool(String tool) {
        if (this.ironStock >= 10) {
            this.ironStock -= 10;
            return tool;
        }
        return "";
    }
}
