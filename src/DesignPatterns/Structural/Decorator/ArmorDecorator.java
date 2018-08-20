package DesignPatterns.Structural.Decorator;

public abstract class ArmorDecorator implements MilitiaInterface {

    protected MilitiaInterface militiaInterface;

    public ArmorDecorator(MilitiaInterface militiaInterface) {
        this.militiaInterface = militiaInterface;
    }
}
