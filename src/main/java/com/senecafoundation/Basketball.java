package com.senecafoundation;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    public String WinnerOfMatch(){
        String[] parts = name.split("vs");
        String team1 = parts[0];
        String team2 = parts[1];
        List<String> list = new ArrayList<>();
        list.add(team1);
        list.add(team2);
        Random rand = new Random();
        int randomitem = rand.nextInt(list.size());
        String randomElement = list.get(randomitem);
        String winner = randomElement;
        return "The winner is of the match is: " + winner;
    }
    
    public String SeatsSoldForMatch(){
        Random rand = new Random();
        int upperBound = 30001;
        int seats = rand.nextInt(upperBound);
        return "The amount of seats sold for the match is" + seats;
    }
}