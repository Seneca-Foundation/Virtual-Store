package com.senecafoundation.ProductObjects.BookObjects;

public class ComicBook extends Book {
    protected String artist;
    public ComicBook(String name, double price, String author, String cover, String description, String artist, double weight) {
        //inherited name, price, description, weight, itemNum, author, cover
        super(name, price, author, cover, description, weight);
        this.artist = artist;
    }
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String GetData() {
        return "Title: " + name + ", Price: $" + this.textFormatter.getPrice() + ", Author: " + author + ", Cover: " + cover + ", Artist: " + artist+ ", Weight: " + weight + ", Item Number: " + getID();
    }
}