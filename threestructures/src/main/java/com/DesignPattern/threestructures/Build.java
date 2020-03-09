package com.DesignPattern.threestructures;

public class Build {
    private Strategy strategy;
    
    public Build(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public String executeStrategy(String location) {
        return strategy.build(location);
    }
}