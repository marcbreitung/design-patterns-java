package DesignPatterns.Structural.Decorator;

public class FeudalAgeHouseDecorator extends BuildingDecorator {

    public FeudalAgeHouseDecorator(Building house) {
        super(house);
    }

    @Override
    public int getHitPoints() {
        return house.getHitPoints();
    }

    @Override
    public void setHitPoints(int hitPoints) {
        house.setHitPoints(hitPoints);
    }

    @Override
    public void hit(int hit) {
        int hitPoints = house.getHitPoints();
        hitPoints -= hit / 4;
        house.setHitPoints(hitPoints);
    }
}
