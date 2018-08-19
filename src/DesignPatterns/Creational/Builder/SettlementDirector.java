package DesignPatterns.Creational.Builder;

public class SettlementDirector {

    public City build(CityBuilder cityBuilder) {

        cityBuilder.createCity();
        cityBuilder.addFarm();
        cityBuilder.addMill();

        return cityBuilder.getCity();
    }
}
