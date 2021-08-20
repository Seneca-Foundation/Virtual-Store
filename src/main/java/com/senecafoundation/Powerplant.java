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

    public String WhatItPowers() {
        String[] parts = name.split("k");
        String amount = parts[0];
        int amountInkWh = Integer.parseInt(amount);
        System.out.println("With this amount of energy, you can power: ");
        if (amountInkWh > 380)
        {
            return "An electric water heater for a month";
        }
        if (amountInkWh >= 100)
        {
            return "A refrigerator for two months";
        }
        if (amountInkWh >= 54) {
            return "A Nissan Leaf Electric Car, clothes washer";
        }
        else
        {
            return "50\" LED television for many hours";
        }
    
    }

}
