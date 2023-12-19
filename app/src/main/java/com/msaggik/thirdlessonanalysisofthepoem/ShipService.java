package com.msaggik.thirdlessonanalysisofthepoem;

public class ShipService {
    private int id;
    private String serviceName;
    private int shipCount;
    private int serviceCost;

    public ShipService(int id, String serviceName, int shipCount, int serviceCost) {
        this.id = id;
        this.serviceName = serviceName;
        this.shipCount = shipCount;
        this.serviceCost = serviceCost;
    }

    public int getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public int getShipCount() {
        return shipCount;
    }

    public int getServiceCost() {
        return serviceCost;
    }
}