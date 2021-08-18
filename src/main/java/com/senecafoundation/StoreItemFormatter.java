package com.senecafoundation;

import java.util.ArrayList;
import java.util.UUID;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class StoreItemFormatter implements ITextFormatter {

    protected double price;
    protected String name;
    protected String description;
    protected ArrayList<String> keywords = new ArrayList<String>();
    protected int itemNum;
    public UUID ID = UUID.randomUUID();

    public StoreItemFormatter(String name, double price, String description, UUID ID, ArrayList<String> keywords) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.ID = ID;
        this.keywords = keywords;
    }

    @Override
    public String GetData() {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        return "Product: " + name  + ", Price: $" + df.format(price) + ", Description: " + description +  ", Item Number: " + ID;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double newPrice) {
        this.price = newPrice;        
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String newName) {
       this.name = newName;
    }

}