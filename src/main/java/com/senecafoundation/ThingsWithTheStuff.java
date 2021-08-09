package com.senecafoundation;

public class ThingsWithTheStuff implements ITextFormatter {

    @Override
    public String GetData() {
        return "Some random stuff";
    }

    @Override
    public double getPrice() {    
        return 0;
    }

    @Override
    public void setPrice(double newPrice) {
        
    }

}