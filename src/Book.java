public class Book extends Storeitem {
    protected string cover; 
    protected string author;

    public Book(float price, String name, String description, int itemNum) {
        super(price, name, description, itemNum);
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
