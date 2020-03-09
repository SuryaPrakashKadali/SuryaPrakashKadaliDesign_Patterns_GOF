package com.DesignPattern.threestructures;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExpensiveObjectImpl implements ExpensiveObject {
	private static final Logger LOGGER=LogManager.getLogger(App.class);
 
    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }
     
    @Override
    public void process() {
        LOGGER.debug("processing complete.");
    }
     
    private void heavyInitialConfiguration() {
        LOGGER.debug("Loading initial configuration...");
    }
     
}