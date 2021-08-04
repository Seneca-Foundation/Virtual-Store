import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception 
    {
        Cart shopCart = new Cart();
        List<Storeitem> allItems = new ArrayList<Storeitem>();
        /*
        System.out.println("Hello, World!");

        Computer tempcomp = new Computer("mac" ,500.0, "red","Apple", "M1 Chip","2021" , 2, 1);
        System.out.println(tempcomp.GetData());
        Textbook book1 = new Textbook("Hungers Games",14.00,"empty","Harcover", "trilogy", new ArrayList<String>(){{add("Suzan Collins");add("Stephanie Meyers");}}, 2,2);
        System.out.println(book1.GetData()); //the expressed intent of the code is the same - Liskov principle
        //how the child is able to replace the parent
        */
        //String name, double price, String color, String computerBrand, String description, String releaseDate, int weight, int itemNum
        allItems.add(new Computer("MacBook Air",900.00, "rose gold","Apple", "New with M1 chip", "2021",2.8, 1)); 
        allItems.add(new Computer("Surface Pro 7",700.00,"red", "Windows", "laptop and tablet in one","2021",1.74, 2)); 

        allItems.add(new Computer("Surface Book 3",1599.99,"black", "Windows", "Touch screen ", "2020", 4.2, 3)); 
        allItems.add(new Computer("Razer Blade 15", 700.00, "blue", "Windows","Advanced laptop w/ Nvidia RTX 2070", "2021",4.63, 4)); 
        allItems.add(new Computer("HP Envy", 1000.99 , "silver", "Window", "11th Generation Intel", "2019", 2.71, 5)); 
        allItems.add(new Computer("Asus ROG Zephyrus", 1549.99, "silver", "Windows", "AMD 5700xt and Ryzen 5600x", "2021",3.5, 6));          
        allItems[5].Keywords = new List<String>() {"silver", "Windows", "M1", "black", "red", "rose gold", "blue", "pink", "Apple", "Intel", "AMD","Nvidia" }; //no limit
        //basketball game tickets
        //String name, double price, int section, int seat, String description, String date, double weight, int itemNum
        allItems.add(new Basketball("Chicago Bulls vs Phoenix Suns", 250.00,109, 30, "section is selling out fast","July 30", 0.2, 7));
        allItems.add(new Basketball("Phoenix Suns vs Bucks", 150, 80, 20, "empty","August 2", 0.2, 8));
        allItems.add(new Basketball("LA Lakers vs Boston Celtics", 250.00,48, 15, "empty","September 24",0.2, 9));
        allItems.add(new Basketball("Brooklyn Nets vs Denver Nuggets",100,50, 24,"empty","October 11",0.2,10)); 
        allItems.add(new Basketball("New York Knicks vs Philadelphia 76ers", 183,140, 49, "empty", "July 3",0.2, 11)); 
        allItems.add(new Basketball("Indiana Pacers vs Milwaukee Bucks", 194, 103, 53,"empty", "June 3", 0.2, 12));
        allItems.add(new Basketball("Denver Nuggets vs Utah Jazz", 139,194, 49,"empty", "April 6", 0.2,13));
        allItems.add(new Basketball("Oklahoma City Thunder vs LA Clippers", 192, ,102, 43,"empty","January 3", 0.2,14));
        allItems.add(new Basketball("San Antoinio Spurs vs Memphis Grizzles",195, 34, 193,"empty", "January 5",0.2,15)); 
        //books
        //String name, double price, String author,String cover, String description, double weight, int itemNum
        allItems.add(new Book("Hunger Games", 15.00, "Suzanne Collins", "hardcover", "24 teens fight each other until one is left standing", 0.7,16)); 
        allItems.add(new Book("The Book Thief", 11, "Markus Zusak", "paperback", "a girl steals books during WWII", 0.97, 17)); 
        allItems.add(new Book("To Kill a Mockingbird", 14, "Harper Lee", "paperback",18)); 
        allItems.add(new Book("The Great Gatsby", 9, "F Scott Fitzgerald", "hardcover",19)); 
        allItems.add(new Book("Things Fall Apart", 14, "Chinua Achebe", "paperback",20)); 
        allItems.add(new Book("The Color Purple", 12, "Alice Walker", "paperback",21)); 
        allItems.add(new Book("Lord of the Flies ", 11, "William Colding", "paperback",22)); 
        allItems.add(new Book("The Hitchhiker's Guide to the Galaxy", 20, "Douglas Adams", "hardcover",23)); 
        allItems.add(new Book("Giovanni's Room", 30, "James Baldwin","paperback",24)); 
        allItems.add(new Book("The Hate U Give" , 11, "Angie Thomas","hardcover",25)); 

        //energy          
        allItems.add(new PowerPlant("100 KWh of energy", 200, 26, "test"));
        allItems.add(new PowerPlant("150 KWh of energy",250, 27, "test"));
        allItems.add(new PowerPlant("200 KWh of energy", 300, 28, "test"));
        allItems.add(new PowerPlant("250 KWh of energy", 350, 29, "test"));
        allItems.add(new PowerPlant("300 Kwh of energy", 400, 30, "test"));
    }
}
