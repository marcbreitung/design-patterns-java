package DesignPatterns.Creational.Prototype;

import java.util.Hashtable;

public class PrototypeFactory {

    private static Hashtable<String, Farmer> farmers = new Hashtable<>();

    public PrototypeFactory() {
        Farmer fieldFarmer = new Farmer();
        fieldFarmer.setName("Field Farmer");
        fieldFarmer.setLivePoints(100);
        fieldFarmer.addFarmerTool(new FarmerTool("Field Tool 1"));
        fieldFarmer.addFarmerTool(new FarmerTool("Field Tool 2"));

        farmers.put("fieldFarmer", fieldFarmer);

        Farmer cattleFarmer = new Farmer();
        cattleFarmer.setName("Cattle Farmer");
        cattleFarmer.setLivePoints(100);
        cattleFarmer.addFarmerTool(new FarmerTool("Cattle Tool 1"));
        cattleFarmer.addFarmerTool(new FarmerTool("Cattle Tool 2"));

        farmers.put("cattleFarmer", cattleFarmer);
    }

    public Farmer getFarmer(String type) {
        Farmer farmer = farmers.get(type);
        return (Farmer) farmer.clone();
    }
}
