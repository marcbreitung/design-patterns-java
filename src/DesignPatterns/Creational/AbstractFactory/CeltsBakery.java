package DesignPatterns.Creational.AbstractFactory;

public class CeltsBakery implements Bakery {

    private String id;
    private int residentsNumber;
    private int flourStock;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int getResidentsNumber() {
        return residentsNumber;
    }

    @Override
    public void setResidentsNumber(int residentsNumber) {
        this.residentsNumber = residentsNumber;
    }

    @Override
    public int getFlourStock() {
        return flourStock;
    }

    @Override
    public void setFlourStock(int flourStock) {
        this.flourStock = flourStock;
    }

    @Override
    public int bakeBreads(int breads) {
        int requiredFlourCapacity = breads * 3;
        if (this.flourStock >= requiredFlourCapacity) {
            this.flourStock -= requiredFlourCapacity;
            return breads;
        }
        return 0;
    }
}
