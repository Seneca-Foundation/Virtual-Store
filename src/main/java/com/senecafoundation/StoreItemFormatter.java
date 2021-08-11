package com.senecafoundation;

import java.util.ArrayList;

public class StoreItemFormatter implements ITextFormatter {

    protected double price;
    protected String name;
    protected String description;
    protected ArrayList<String> keywords = new ArrayList<String>();
    protected int itemNum;

    public StoreItemFormatter(String name, double price, String description, int itemNum, ArrayList<String> keywords) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.itemNum = itemNum;
        this.keywords = keywords;
    }

    @Override
    public String GetData() {
        return "Product: " + name  + ", Price: $" + price + ", " + ", Description: " + description +  ", " + " Item Number: " + itemNum;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double newPrice) {
        this.price = newPrice;        
    }

}