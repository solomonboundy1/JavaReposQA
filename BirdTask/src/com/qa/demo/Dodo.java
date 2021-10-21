package com.qa.demo;

import com.qa.interfaces.ExtinctCreature;
import com.qa.interfaces.LayEggsInterface;

public class Dodo implements ExtinctCreature, LayEggsInterface {
    private String currentLocation;
    private int numberOfEggs;

    public Dodo(int initialEggCount) {
        this.setNumberOfEggs(initialEggCount);
    }
    
    @Override
    public void layEggs() {
        this.setNumberOfEggs(getNumberOfEggs() + 2);
    }
    @Override
    public void goExtinct() {
        this.setCurrentLocation("in a museum");
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