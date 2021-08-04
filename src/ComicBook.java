public class ComicBook extends Book {
    protected String artist;
    public ComicBook(String name, double price, String author, String cover, String description, String artist, int weight, int itemNum) {
        //inherited name, price, description, weight, itemNum, author, cover
        super(name, price, author, cover, description, weight, itemNum);
        this.artist = artist;
    }
    public String GetData() {
        return "Title: " + name + ", Price: $" + price + ", Author: " + author + ", Cover: " + cover + ", Artist: " + artist+ ", Weight: " + weight + ", Item Number: " + itemNum;
    }
}
