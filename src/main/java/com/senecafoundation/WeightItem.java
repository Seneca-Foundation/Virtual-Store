package com.senecafoundation;

public class WeightItem extends StoreItem
{
    protected double weight;
    public WeightItem(String name, double price, String description, double weight, int itemNum) {
        super(name, price, description, itemNum);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
