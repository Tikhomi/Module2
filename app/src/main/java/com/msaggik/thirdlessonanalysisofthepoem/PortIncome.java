package com.msaggik.thirdlessonanalysisofthepoem;

public class PortIncome {
    private int id;
    private String incomeName;
    private int incomeAmount;

    public PortIncome(int id, String incomeName, int incomeAmount) {
        this.id = id;
        this.incomeName = incomeName;
        this.incomeAmount = incomeAmount;
    }

    public int getId() {
        return id;
    }

    public String getIncomeName() {
        return incomeName;
    }

    public int getIncomeAmount() {
        return incomeAmount;
    }
}