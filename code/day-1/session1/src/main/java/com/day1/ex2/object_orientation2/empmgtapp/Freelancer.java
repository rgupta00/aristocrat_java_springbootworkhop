package com.day1.ex2.object_orientation2.empmgtapp;

public class Freelancer implements Payable{
    private int id;
    private String companyRegNo;
    private double assignmentCost;

    public Freelancer(int id, String companyRegNo, double assignmentCost) {
        this.id = id;
        this.companyRegNo = companyRegNo;
        this.assignmentCost = assignmentCost;
    }

    @Override
    public double getPayement() {
        return assignmentCost*.9;
    }
}
