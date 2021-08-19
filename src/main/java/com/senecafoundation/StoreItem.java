package com.senecafoundation;

import java.util.ArrayList;
import java.util.UUID;

public class StoreItem {
    public double price;
    public String name;
    public String description;
    protected ArrayList<String> keywords = new ArrayList<String>();
    public UUID ID = UUID.randomUUID();
    protected ITextFormatter textFormatter;
    public ICreateData createData;
    public IDeleteData deleteData;
    public IReadData readData;
    public IUpdateData updateData;

    public double getPrice() {
        return this.price;
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }

    public UUID getID() {
        return ID;
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

    public void setID() {
        ID = UUID.randomUUID();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StoreItem(String name, double price, String description) {
        this.price = price;
        this.name = name; 
        this.description = description;
        this.ID = UUID.randomUUID();
        this.keywords = new ArrayList<String>();
    }

    public double Calc() {
        this.price = this.price * 0.70;
        return this.price;
        
    }

    public String GetData(ITextFormatter userTextFormatter)
    {
        this.textFormatter = userTextFormatter;
        return this.textFormatter.GetData();
    }
    //dependency injection is that you're depending on another class (or interface), and injecting, passing, the dependency in as parameter
    //hard coded is if you cannot change the value of a variable
}
