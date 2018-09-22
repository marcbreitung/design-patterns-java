package DesignPatterns.Creational.Builder;

public interface SettlementBuilder {
    void buildSettlement();

    void addForge();

    void addBakery();

    Settlement Settlement();
}
