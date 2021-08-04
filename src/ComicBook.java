public class ComicBook extends Book {
    protected String artist;
    public ComicBook(String name, double price, String description, String artist, int weight, int itemNum) {
        super(name, price, description, weight, itemNum);
        this.artist = artist;
    }
    public String GetData() {
        return "Title: " + name + ", Author: " + author + ", Cover: " + cover + ", Price: " + price + ", Artist: " + artist+ ", Weight: " + weight + ", Item Number: " + itemNum;
    }
}
