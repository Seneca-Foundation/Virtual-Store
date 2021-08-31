package com.senecafoundation.ProductObjects.BookObjects;

public class UsedBooks extends Book 
{
    protected String condition;
    
    public UsedBooks(String name, double price, String author, String cover, String description, String condition, double weight) {
            
    super(name, price, author, cover, description, weight);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
    
    public String GetData() {
        return "Title: " + name + ", Price: $" + price + ", Author: " + author + ", Cover: " + cover + ", Condition: " + condition + ", Weight: " + weight + ", Item Number: " + getID();
    }

    @Override 
    public String toString() {
        return this.getClass().getSimpleName() + "," + this.getID() + "," + this.getName() + "," + String.valueOf(this.getPrice()) + "," + this.getAuthor() + "," + this.getCover() + "," +this.getDescription() + "," + this.getCondition() + "," + this.getWeight();
    }   
}
