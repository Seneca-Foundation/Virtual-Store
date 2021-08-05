import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App 
{
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
        //allItems[5].Keywords = new ArrayList<String>(){"silver", "Windows", "M1", "black", "red", "rose gold", "blue", "pink", "Apple", "Intel", "AMD","Nvidia" }; //no limit
        //basketball game tickets
        //String name, double price, int section, int seat, String description, String date, double weight, int itemNum
        allItems.add(new Basketball("Chicago Bulls vs Phoenix Suns", 250.00,109, 30, "section is selling out fast","July 30", 0.2, 7));
        allItems.add(new Basketball("Phoenix Suns vs Bucks", 150, 80, 20, "empty","August 2", 0.2, 8));
        allItems.add(new Basketball("LA Lakers vs Boston Celtics", 250.00,48, 15, "empty","September 24",0.2, 9));
        allItems.add(new Basketball("Brooklyn Nets vs Denver Nuggets",100,50, 24,"empty","October 11",0.2,10)); 
        allItems.add(new Basketball("New York Knicks vs Philadelphia 76ers", 183,140, 49, "empty", "July 3",0.2, 11)); 
        allItems.add(new Basketball("Indiana Pacers vs Milwaukee Bucks", 194, 103, 53,"empty", "June 3", 0.2, 12));
        allItems.add(new Basketball("Denver Nuggets vs Utah Jazz", 139,194, 49,"empty", "April 6", 0.2,13));
        allItems.add(new Basketball("Oklahoma City Thunder vs LA Clippers", 192, 102, 43,"empty","January 3", 0.2,14));
        allItems.add(new Basketball("San Antoinio Spurs vs Memphis Grizzles",195, 34, 193,"empty", "January 5",0.2,15)); 
        //books
        //String name, double price, String author,String cover, String description, double weight, int itemNum
        allItems.add(new Book("Hunger Games", 15.00, "Suzanne Collins", "hardcover", "24 teens fight each other until one is left standing", 0.7,16)); 
        allItems.add(new Book("The Book Thief", 11.99, "Markus Zusak", "paperback", "a girl steals books during WWII", 0.97, 17)); 
        allItems.add(new Book("To Kill a Mockingbird", 14.00, "Harper Lee", "paperback", "a lawyer defends a black man who was falsely accused by racists",0.37,18)); 
        allItems.add(new Book("The Great Gatsby", 9.50, "F Scott Fitzgerald", "hardcover","a millionare is obsessed with reuniting with his former love", 0.34,19)); 
        allItems.add(new Book("Things Fall Apart", 14.00, "Chinua Achebe", "hardcover","depicts pre-colonial life in Nigeria", 1.36,20)); 
        allItems.add(new Book("The Color Purple", 12.99, "Alice Walker", "paperback","a black woman suffers abuse in the South", 0.55, 21)); 
        allItems.add(new Book("Lord of the Flies ", 11.30, "William Colding", "paperback","young boys are stranded on an island & chaos ensues", 0.3, 22)); 
        allItems.add(new Book("The Hitchhiker's Guide to the Galaxy", 20.00, "Douglas Adams", "hardcover","a guy gets into trouble while travelling galaxy", 0.25, 23)); 
        allItems.add(new Book("Giovanni's Room", 30.00, "James Baldwin","paperback", "young, engaged man has an affair with a bartender", 0.51, 24)); 
        allItems.add(new Book("The Hate U Give" , 11.99, "Angie Thomas","hardcover", "a girl witnesses the tragic death of her friend, sparking protests", 0.95, 25)); 

        //energy          
        //String name, double price,  String description, double weight, int itemNum
        allItems.add(new Powerplant("100 KWh", 200.00, "provides enough energy", 0.0, 26));
        allItems.add(new Powerplant("150 KWh",250, "provides enough energy", 0.0, 27));
        allItems.add(new Powerplant("200 KWh of energy", 300, "provides enough energy", 0.0, 28));
        allItems.add(new Powerplant("250 KWh of energy", 350, "provides enough energy", 0.0, 29));
        allItems.add(new Powerplant("300 Kwh of energy", 400, "provides enough energy", 0.0, 30));

        //password
        System.out.println("Create password");
        Scanner userInputScanner = new Scanner(System.in); //one scanner
        String passwordscanned = userInputScanner.nextLine();
        System.out.println("Enter password");
        String userInputscanned = userInputScanner.nextLine();
        if (userInputscanned == passwordscanned)
        {
            System.out.println("Correct password");
        }
        else 
        {
            System.out.println("Incorrect password");
        }

        // Menu
        System.out.println("Welcome! This is what we offer");
        System.out.println("Books");
        System.out.println("Computers");
        System.out.println("Basketball tickets");
        System.out.println("Energy");
        //String userCategoryInput; 
        boolean userIsStillShopping = true;
        boolean userIsStillSearching;
       // String userSearchInput;
       
        while (userIsStillShopping)
        {
            System.out.println("Which item category do you want? Type b for books, c for computers, e for energy, or t for basketball tickets. You can also press s to search a specific product.");
           // Scanner userInputScanner= new Scanner(System.in);
            String userCategoryInput = userInputScanner.nextLine();
            if (userCategoryInput == "s")
            {
                
                userIsStillSearching = true;
                while (userIsStillSearching)
                {
                    System.out.println("What would you like to search?");
                    //Scanner userSearch  = new Scanner(System.in);
                    String userSearchInput  = userInputScanner.nextLine();
                    
                    var itemFoundInSearch = allItems.stream().filter(item -> item.itemNum == Integer.parseInt(userSearchInput)).findAny().orElse(null);
                    //Storeitem itemFoundInSearch;
                    //Search.findItem(userSearchInput, itemFoundInSearch, allItems);
                    if (itemFoundInSearch != null)
                    {
                        System.out.println("Found it: " + itemFoundInSearch.GetData());
                        System.out.println("Would you like to add this item to your cart? Type y for yes or n for no.");
                        //Scanner userCart  = new Scanner(System.in);
                        String InputCart = userInputScanner.nextLine();
                       
                        if (InputCart == "y")
                        {
                            shopCart.AddToCart(itemFoundInSearch);
                            System.out.println("Item has been added to your cart.");
                        }
                        else if (InputCart == "n")
                        {
                            System.out.println("This item has not been added to your cart.");
                        }
                        else 
                        {
                            System.out.println("Incorrect input.  The item was not added to your cart.");
                        }
                    }
                    else
                    { 
                        System.out.println("The item was not found.  Nothing was added to your cart.");
                    }

                    System.out.println("Would you like to keep searching? Type y for yes or n for no");
                    boolean didUserEnterValidInputForCartItem = false;
                    while (didUserEnterValidInputForCartItem == false)
                    {
                        //Scanner scannerSearch  = new Scanner(System.in);
                        String InputSearch = userInputScanner.nextLine();
                        
                        if (InputSearch == "n")
                        {
                            userIsStillSearching = false;
                            didUserEnterValidInputForCartItem = true;
                        }
                        else if (InputSearch == "y")
                        {
                            userIsStillSearching = true;
                            didUserEnterValidInputForCartItem = true;
                        }
                        else 
                        {
                            System.out.println("Incorrect input. Would you like to keep searching? Type y for yes or n for no.");
                            didUserEnterValidInputForCartItem = false;
                        }
                    }
                }
            }
            else if (userCategoryInput == "b" || userCategoryInput == "c" || userCategoryInput == "e" || userCategoryInput == "t")
            {
                
                boolean userIsStillAddingItemsFromMenu = true;
                while (userIsStillAddingItemsFromMenu)
                {
                    for (var item : allItems) 
                    {
                        if (userCategoryInput == "b" && item instanceof Book) {
                            var tempBook = (Book)item;
                            System.out.println(tempBook.GetData());
                        }
                        else if (userCategoryInput == "c" && item instanceof Computer) {
                            var tempComputer = (Computer)item;
                            System.out.println(tempComputer.GetData());
                        }
                        else if (userCategoryInput == "e" && item instanceof Powerplant) {
                            var tempPower = (Powerplant)item;
                            System.out.println(tempPower.GetData());
                        }
                        else if (userCategoryInput == "t" && item instanceof Basketball) {
                            var tempBasketball = (Basketball)item;
                            System.out.println(tempBasketball.GetData());
                        }
                    
                    }
                    System.out.println("What would you like to buy? Please write an item number.");
                    //Scanner userItemNum  = new Scanner(System.in);
                    String itemNumberTheUserChose  = userInputScanner.nextLine();
                    
                    //var foundItem = allItems.stream().filter(item -> itemNumberTheUserChose.equals(item.getItemNum())).findAny().orElse(null);
                    var foundItem = allItems.stream().filter(item -> item.itemNum == Integer.parseInt(itemNumberTheUserChose)).findAny().orElse(null);
                    if (foundItem != null) {
                        shopCart.AddToCart(foundItem);
                        
                        System.out.println("This item has been added to cart: " + foundItem.name); 
                        System.out.println("Would you like to add another item to the cart? Type y for yes or n for no.");
                        
                        boolean didUserEnterValidInputForFoundItem = false;
                        while (didUserEnterValidInputForFoundItem == false)
                        {
                            //Scanner anotherItemScanner = new Scanner(System.in);
                            String doesUserWantToAddAnotherItem = userInputScanner.nextLine();
                            
                            if (doesUserWantToAddAnotherItem == "n")
                            {
                                didUserEnterValidInputForFoundItem = true;
                                userIsStillAddingItemsFromMenu = false;
                            }
                            else if (doesUserWantToAddAnotherItem == "y")
                            {
                                didUserEnterValidInputForFoundItem = true;
                                userIsStillAddingItemsFromMenu = true;
                            }
                            else 
                            {
                                System.out.println("Incorrect input. Would you like to add another item to the cart? Type y for yes or n for no.");
                                didUserEnterValidInputForFoundItem = false;
                            }
                        }
                    }
                    else {
                        System.out.println("Incorrect input. Please write a valid item number from a book.");
                    }
                }
            }
            else {
                System.out.println("You did not make a valid selection.");
            }
            System.out.println("Are you done shopping for today? Type y for yes or n for no.");
            boolean didUserEnterValidInput = false;
            while (didUserEnterValidInput == false) 
            {
                //Scanner doneShopScanner = new Scanner(System.in);
                String doneShoppingInput = userInputScanner.nextLine();
               
                if (doneShoppingInput == "y")
                {
                    shopCart.PrintItems();
                    didUserEnterValidInput = true;
                    userIsStillShopping = false;
                }
                else if (doneShoppingInput == "n")
                {
                    didUserEnterValidInput = true;
                    userIsStillShopping = true;
                }
                else 
                {
                    System.out.println("Incorrect input. Are you done shopping for today? Type y for yes or n for no");
                    didUserEnterValidInput = true;
                }
            }
        }
    }
}
