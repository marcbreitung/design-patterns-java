package DesignPatterns.Creational.AbstractFactory;

public interface Farm {
    void setFieldArea(int x, int y);

    int getFieldArea();

    int harvest();
}
