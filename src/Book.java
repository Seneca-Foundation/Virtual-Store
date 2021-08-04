public class Book extends WeightItem {
    protected String cover; 
    protected String author;

    public Book(String name, double price, String author,String cover, String description, double weight, int itemNum) {
        //inherited ame, price, description, weight, itemNum
        super(name, price, description, weight, itemNum);
        this.author = author;
        this.cover = cover;
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
        return "Title: " + name +  ", Price: $" + price + ", Author: " + author + ", Cover: " + cover + ", Weight: " + weight + ", Item Number: " + itemNum;
    }

}
