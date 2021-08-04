public class Book extends WeightItem {
    protected String cover; 
    protected String author;

    public Book(String name, double price, String description, int weight, int itemNum) {
        super(name, price, description, weight, itemNum);
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
        return "Title: " + name + ", Author: " + author + ", Cover: " + cover + ", Price: " + price + ", Weight: " + weight + ", Item Number: " + itemNum;
    }

}
