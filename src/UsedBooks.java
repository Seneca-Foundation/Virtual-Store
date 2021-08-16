public class UsedBooks extends Book {
    protected string Condition;
    public UsedBooks(String name, double price, String author, String cover, String description, String Condition, double weight, int itemNum) {
        
    super(name, price, author, cover, description, weight, itemNum);
    this.Condition = this.Condition;
    }
    public String GetData() {
        return "Title: " + name + ", Price: $" + price + ", Author: " + author + ", Cover: " + cover + ", Condition: " + Condition+ ", Weight: " + weight + ", Item Number: " + itemNum;
    }




}
