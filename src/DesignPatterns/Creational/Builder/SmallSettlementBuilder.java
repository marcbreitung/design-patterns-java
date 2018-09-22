package DesignPatterns.Creational.Builder;

import DesignPatterns.Creational.AbstractFactory.BritonsBakery;
import DesignPatterns.Creational.AbstractFactory.BritonsForge;

public class SmallSettlementBuilder implements SettlementBuilder {

    private Settlement settlement;

    @Override
    public void buildSettlement() {
        settlement = new Settlement();
    }

    @Override
    public void addForge() {
        BritonsForge forge = new BritonsForge();
        forge.setIronStock(10);
        settlement.setForge(forge);
    }

    @Override
    public void addBakery() {
        BritonsBakery bakery = new BritonsBakery();
        bakery.setFlourStock(10);
        settlement.setBakery(bakery);
    }

    @Override
    public Settlement Settlement() {
        return settlement;
    }
}
