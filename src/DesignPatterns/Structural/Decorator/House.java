package DesignPatterns.Structural.Decorator;

public class House implements Building {

    private int hitPoints;

    @Override
    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public void hit(int hit) {
        hitPoints -= hit / 2;
    }
}
