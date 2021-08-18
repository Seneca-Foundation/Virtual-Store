package com.senecafoundation;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Basketball extends WeightItem
{
    private String date;
    private int section;
    private int seat;

    public Basketball(String name, double price, int section, int seat, String description, String date, double weight) {
        super(name, price, description, weight);
        this.date = date;
        this.section = section;
        this.seat = seat;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String GetData(){
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        return "Match: " + name + ", Price: $" + df.format(this.textFormatter.getPrice()) + ", Date: " + date + ", Section: " + section + ", Seat: " + seat + ", Weight: " + weight + ", Item Number: " + getID();
    }
}