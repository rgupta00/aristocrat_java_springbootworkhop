package com.day1.ex2.object_orientation2.empmgtapp;

abstract public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    abstract public double getPayement();
}
