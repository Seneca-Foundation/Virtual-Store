package com.senecafoundation;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Powerplant extends WeightItem
{
    public Powerplant(String name, double price,  String description, double weight) 
    {
        super(name,price,description, weight);
    }

    public String GetData(){
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        return "Product: " + name + ", Price: $" + df.format(this.textFormatter.getPrice()) + ", Weight:" + weight + ", Item Number: " + getID();
    }  
    
}
