package com.DesignPattern.threestructures;

public class Skyscraper implements Strategy {

    @Override
    public String build(String location) {
        return "Building a skyscraper in the " + location + " area.";
    }
}