package com.senecafoundation;

public class UsedBooks extends Book {

    
        protected String Condition;
    
        public UsedBooks(String name, double price, String author, String cover, String description, String condition, double weight, int itemNum) {
            
        super(name, price, author, cover, description, weight, itemNum);
            this.Condition = condition;
        }
    
        public String GetData() {
            return "Title: " + name + ", Price: $" + price + ", Author: " + author + ", Cover: " + cover + ", Condition: " + Condition+ ", Weight: " + weight + ", Item Number: " + itemNum;
        }
    
    }