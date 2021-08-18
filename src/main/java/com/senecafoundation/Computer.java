package com.senecafoundation; //this is the package

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Computer extends WeightItem 
{

    private String computerBrand;
    private String releaseDate;
    private String color; 
    //if you were to remove private/public/protected, then the default visibility is anything inside the package. Only package can see
    public Computer(String name, double price, String color, String computerBrand, String description, String releaseDate, double weight) {
        super(name, price, description, weight);
        this.computerBrand = computerBrand;
        this.releaseDate = releaseDate;
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getComputerBrand() {
        return computerBrand;
    }

    public void setComputerBrand(String computerBrand) {
        this.computerBrand = computerBrand;
    }
    public String GetData()
    {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        return "Computer: " + name  +  ", Price: $" + df.format(this.textFormatter.getPrice()) + ", Color: " + color + ", Computer Brand: "+ computerBrand + ", Description: " + description +  ", Release Date: " + releaseDate + ", Weight: "+ weight + " pounds, Item Number: " + getID();
    }
    
}
