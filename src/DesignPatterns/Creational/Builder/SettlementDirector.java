package DesignPatterns.Creational.Builder;

public class SettlementDirector {

    public Settlement build(SettlementBuilder builder) {

        builder.buildSettlement();
        builder.addForge();
        builder.addBakery();

        return builder.Settlement();
    }
}
