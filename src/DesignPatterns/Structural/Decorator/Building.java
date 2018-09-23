package DesignPatterns.Structural.Decorator;

public interface Building {
    int getHitPoints();

    void setHitPoints(int hitPoints);

    void hit(int hit);
}
