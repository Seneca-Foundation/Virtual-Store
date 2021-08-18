package com.senecafoundation;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Book extends WeightItem {
    protected String cover; 
    protected String author;

    public Book(String name, double price, String author,String cover, String description, double weight) {
        //inherited ame, price, description, weight, itemNum
        super(name, price, description, weight);
        this.author = author;
        this.cover = cover;
    }
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String GetData() {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        return "Title: " + name +  ", Price: $" + df.format(this.textFormatter.getPrice()) + ", Author: " + author + ", Cover: " + cover + ", Description: " + description+", Weight: " + weight + ", Item Number: " + getID();
    }

}
