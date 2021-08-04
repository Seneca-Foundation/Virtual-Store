import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception 
    {
        Cart shopCart = new Cart();
        List<Storeitem> allItems = new ArrayList<Storeitem>();
        System.out.println("Hello, World!");

        Computer tempcomp = new Computer("mac" ,500.0, "red","Apple", "M1 Chip","2021" , 2, 1);
        System.out.println(tempcomp.GetData());
        Textbook book1 = new Textbook("Hungers Games",14.00,"empty","Harcover", "trilogy", new ArrayList<String>(){{add("Suzan Collins");add("Stephanie Meyers");}}, 2,2);
        System.out.println(book1.GetData()); //the expressed intent of the code is the same - Liskov principle
        //how the child is able to replace the parent
    }
}
