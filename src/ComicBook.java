public class ComicBook extends Book {
    protected String artist;
    public ComicBook(float price, String name, String description, String artist, int weight, int itemNum) {
        super(price, name, description, weight, itemNum);
        this.artist = artist;
    }
    public String GetData() {
        return "Title: " + name + ", Author: " + author + ", Cover: " + cover + ", Price: " + price + ", Artist: " + artist+ ", Weight: " + weight + ", Item Number: " + itemNum;
    }
}
