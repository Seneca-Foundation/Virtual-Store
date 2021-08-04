public class Book extends WeightItem {
    protected String cover; 
    protected String author;

    public Book(float price, String name, String description, int weight, int itemNum) {
        super(price, name, description, weight, itemNum);
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
