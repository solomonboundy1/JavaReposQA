package com.qa.demo;

import com.qa.interfaces.FlyInterface;
import com.qa.interfaces.LayEggsInterface;

public class Falcon implements FlyInterface, LayEggsInterface {
    private String currentLocation;
    private int numberOfEggs;

    public Falcon(int initialEggCount) {
        this.setNumberOfEggs(initialEggCount);
    }
    
    @Override
    public void fly() {
        this.setCurrentLocation("In the sky");
    }
    
    @Override
    public void layEggs() {
        this.setNumberOfEggs(getNumberOfEggs() + 1);
    }


    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getNumberOfEggs() {
        return numberOfEggs;
    }

    public void setNumberOfEggs(int numberOfEggs) {
        this.numberOfEggs = numberOfEggs;
    }
}