package com.DesignPattern.threestructures;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Circle implements Shape {
	private static final Logger LOGGER=LogManager.getLogger(App.class);
      @Override
      public void draw() {
    	  LOGGER.debug("Drawing Circle");
      }
      @Override
      public void resize() {
    	  LOGGER.debug("Resizing Circle");
      }
      @Override
      public String description() {
    	  return "Circle object";
      }
      @Override
      public boolean isHide() {
    	  return false;
      }
}