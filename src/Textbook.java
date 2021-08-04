import java.util.ArrayList;
import java.util.List;

public class Textbook extends Book {
    List<String> authors = new ArrayList<String>();
    public Textbook(String name, double price, String description, List<String> authors, int weight, int itemNum) {
        super(name, price, description, weight, itemNum);
        this.authors = authors;
    }
    public String GetData() {

        //return "Title: " + name + ", Author: " + String.join(",", authors) + ", Cover: " + cover + ", Price: " + price + ", Weight: " + weight + ", Item Number: " + itemNum;
        return "Do a little dance make a little noise";
    }
    
}
