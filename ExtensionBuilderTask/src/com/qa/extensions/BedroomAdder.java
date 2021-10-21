package com.qa.extensions;

public class BedroomAdder {
    public void addBedroom(Penthouse penthouse) {
        
        penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + 2);
        
    }
}