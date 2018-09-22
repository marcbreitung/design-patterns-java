package DesignPatterns.Creational.Prototype;

import java.util.Vector;

public class Farmer implements Cloneable {

    private int livePoints;
    private Vector<FarmerTool> farmerTools = new Vector<>();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLivePoints(int livePoints) {
        this.livePoints = livePoints;
    }

    public int getLivePoints() {
        return livePoints;
    }

    public void addFarmerTool(FarmerTool farmerTool) {
        this.farmerTools.add(farmerTool);
    }

    public Vector<FarmerTool> getFarmerTools() {
        return farmerTools;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
