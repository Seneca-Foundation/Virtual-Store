package com.senecafoundation.ProductObjects;

public class UsedBooks extends Book {

    
        protected String Condition;
    
        public UsedBooks(String name, double price, String author, String cover, String description, String condition, double weight) {
            
        super(name, price, author, cover, description, weight);
            this.Condition = condition;
        }
    
        public String GetData() {
            return "Title: " + name + ", Price: $" + price + ", Author: " + author + ", Cover: " + cover + ", Condition: " + Condition+ ", Weight: " + weight + ", Item Number: " + getID();
        }
    
    }
