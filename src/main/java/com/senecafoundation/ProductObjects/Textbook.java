package com.senecafoundation.ProductObjects;

import java.util.ArrayList;
import java.util.List;

public class Textbook extends Book {
    List<String> authors = new ArrayList<String>();
    public Textbook(String name, double price, String author, String cover, String description, List<String> authors, double weight) {
        ////inherited name, price, description, weight, itemNum, author, cover
        super(name, price, author, cover, description, weight);
        this.authors = authors;
    }
    public String GetData() {

        return "Title: " + name + ", Price: $" + this.textFormatter.getPrice() + ", Authors: " + String.join(",", authors) + ", Cover: " + cover + ", Weight: " + weight + ", Item Number: " + getID();
        
    }
    
}
