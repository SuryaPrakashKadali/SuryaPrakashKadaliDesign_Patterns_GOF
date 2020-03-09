package com.DesignPattern.threestructures;

public class House implements Strategy {

    @Override
    public String build(String location) {
        return "Building a house in the " + location + " area.";
    }
}