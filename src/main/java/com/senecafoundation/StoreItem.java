package com.senecafoundation;

import java.util.ArrayList;

public class StoreItem implements ITextFormatter {
    protected double price;
    protected  String name;
    protected String description;
    protected ArrayList<String> keywords = new ArrayList<String>();
    protected int itemNum;

    public double getPrice() {
        return price;
    }
    public ArrayList<String> getKeywords() {
        return keywords;
    }
    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }
    public int getItemNum() {
        return itemNum;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public StoreItem(String name, double price, String description, int itemNum) {
        this.price = price;
        this.name = name; 
        this.description = description;
        this.itemNum = itemNum;
        this.keywords = new ArrayList<String>();
    }
    public double Calc() {
        this.price = this.price * 0.70;
        return this.price;
        
    }
    public String GetData()
    {
        return "Product: " + name  + ", Price: $" + price + ", " + ", Description: " + description +  ", " + " Item Number: " + itemNum;
    }
}