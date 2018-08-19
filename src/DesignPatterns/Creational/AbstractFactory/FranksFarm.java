package DesignPatterns.Creational.AbstractFactory;

public class FranksFarm implements Farm {
    private int squareMetre;

    @Override
    public void setFieldArea(int x, int y) {
        this.squareMetre = x * y;
    }

    @Override
    public int getFieldArea() {
        return this.squareMetre;
    }

    @Override
    public int harvest() {
        return this.squareMetre * 3;
    }
}
