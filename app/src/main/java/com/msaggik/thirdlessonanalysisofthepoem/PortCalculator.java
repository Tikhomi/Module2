package com.msaggik.thirdlessonanalysisofthepoem;

import java.util.List;

public class PortCalculator {
    private List<PortIncome> incomes;
    private List<ShipService> services;

    public PortCalculator(List<PortIncome> incomes, List<ShipService> services) {
        this.incomes = incomes;
        this.services = services;
    }

    public int calculateTotalRevenue() {
        int totalIncome = 0;

        for (PortIncome income : incomes) {
            totalIncome += income.getIncomeAmount();
        }

        for (ShipService service : services) {
            totalIncome += service.getShipCount() * service.getServiceCost();
        }

        return totalIncome;
    }
}