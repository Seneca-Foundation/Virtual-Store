package com.senecafoundation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Cart shopCart = new Cart();
        List<StoreItem> allItems = new ArrayList<StoreItem>();

        //computers
        allItems.add(new Computer("Asus ROG Zephyrus", 1549.99, "silver", "Windows", "AMD 5700xt and Ryzen 5600x", "2021",3.5, 1));
        allItems.get(0).setKeywords(new ArrayList<String>() {{ add("Asus");add("ROG");add("silver");add("AMD");add("Ryzen");add("5700xt");add("5600x"); ;}}); 
        allItems.add(new Computer("HP Envy", 1000.99 , "Grey", "Window", "11th Generation Intel", "2019", 2.71, 2));
        allItems.get(1).setKeywords(new ArrayList<String>() {{ add("Grey");add("Intel");add("11th generation");add("HP");add("HP Envy");   ;}});         
        allItems.add(new Computer("MacBook Air",900.00, "rose gold","Apple", "New with M1 chip", "2021",2.8, 3)); 
        allItems.get(2).setKeywords(new ArrayList<String>() {{ add("M1 chip");add("rose gold");add("MacBook");add("Mac");}}); 
        allItems.add(new Computer("Razer Blade 15", 700.00, "blue", "Windows","Advanced laptop w/ Nvidia RTX 2070", "2021",4.63, 4));
        allItems.get(3).setKeywords(new ArrayList<String>() {{ add("blue");add("Nvidia");add("RTX 2070");add("Razer");}}); 
        allItems.add(new Computer("Surface Book 3",1599.99,"black", "Windows", "Touch screen ", "2020", 4.2, 5)); 
        allItems.get(4).setKeywords(new ArrayList<String>() {{ add("black");add("Touch screen");add("Surface Book");}}); 
        allItems.add(new Computer("Surface Pro 7",700.00,"red", "Windows", "laptop and tablet in one","2021",1.74, 6)); 
        allItems.get(5).setKeywords(new ArrayList<String>() {{ add("red");add("tablet");add("Surface Pro");}}); 
     
        //basketball game tickets
        allItems.add(new Basketball("Brooklyn Nets vs Denver Nuggets",100,50, 24,"empty","October 11",0.2, 7));
        allItems.get(6).setKeywords(new ArrayList<String>() {{ add("Denver Nuggets");add("Brooklyn");add("Nets");add("Denver");add("Brooklyn Nets");}}); 
        allItems.add(new Basketball("Chicago Bulls vs Phoenix Suns", 250.00,109, 30, "section is selling out fast","July 30", 0.2, 8));
        allItems.get(7).setKeywords(new ArrayList<String>() {{ add("Bulls");add("Phoenix");add("Suns");add("Chicago");add("Phoenix Suns");add("Chicago Bulls");add("expensive");add("$250");}}); 
        allItems.add(new Basketball("Denver Nuggets vs Utah Jazz", 139,194, 49,"empty", "April 6", 0.2, 9));
        allItems.get(8).setKeywords(new ArrayList<String>() {{ add("Denver Nuggets");add("Utah");add("Utah Jazz");add("cheapest");add("$139");}}); 
        allItems.add(new Basketball("Indiana Pacers vs Milwaukee Bucks", 194, 103, 53,"empty", "June 3", 0.2, 10));
        allItems.get(9).setKeywords(new ArrayList<String>() {{ add("Indiana Pacer");add("Milwaukee Bucks");add("Bucks");add("Pacers");add("$194");}}); 
        allItems.add(new Basketball("LA Lakers vs Boston Celtics", 250.00,48, 15, "empty","September 24",0.2, 11));
        allItems.get(10).setKeywords(new ArrayList<String>() {{ add("Laker");add("Boston");add("Celtics");add("great seats");add("$250");}}); 
        allItems.add(new Basketball("New York Knicks vs Philadelphia 76ers", 183,140, 49, "empty", "July 3",0.2, 12)); 
        allItems.get(11).setKeywords(new ArrayList<String>() {{ add("New York Knicks");add("New York");add("Philadelphia");add("76ers");add("Philadelphia 76ers");add("$183");}}); 
        allItems.add(new Basketball("Oklahoma City Thunder vs LA Clippers", 192, 102, 43,"empty","January 3", 0.2, 13));
        allItems.get(12).setKeywords(new ArrayList<String>() {{ add("Oklahoma City Thunder");add("Oklahoma City");add("Thunder");add("LA");add("Clippers");add("$192");}}); 
        allItems.add(new Basketball("Phoenix Suns vs Bucks", 150, 80, 20, "empty","August 2", 0.2, 14));
        allItems.get(13).setKeywords(new ArrayList<String>() {{ add("Phoenix Suns");add("Phoenix");add("Bucks");add("$150");}}); 
        allItems.add(new Basketball("San Antonio Spurs vs Memphis Grizzles",195, 34, 193,"empty", "January 5",0.2, 15)); 
        allItems.get(14).setKeywords(new ArrayList<String>() {{ add("San Antonio Spurs");add("Spurs");add("San Antonio");add("Memphis");add("Grizzles");add("Memphis Grizzles");add("$195");}}); 
              
        //books
        allItems.add(new Book("Giovanni's Room", 30.00, "James Baldwin","paperback", "young, engaged man has an affair with a bartender", 0.51, 16)); 
        allItems.get(15).setKeywords(new ArrayList<String>() {{ add("Giovanni");add("room");add("James Baldwin");add("$30");}});
        allItems.add(new Book("Hunger Games", 15.00, "Suzanne Collins", "hardcover", "24 teens fight each other until one is left standing", 0.7,17)); 
        allItems.get(16).setKeywords(new ArrayList<String>() {{ add("Hunger");add("games");add("Suzanne Collins");add("$15");}});
        allItems.add(new Book("Lord of the Flies ", 11.30, "William Colding", "paperback","young boys are stranded on an island & chaos ensues", 0.3, 18));
        allItems.get(17).setKeywords(new ArrayList<String>() {{ add("Lord of the Flies");add("lord of the flies");add("William Colding");add("$11.30");}});
        allItems.add(new Book("The Book Thief", 11.99, "Markus Zusak", "paperback", "a girl steals books during WWII", 0.97, 19)); 
        allItems.get(18).setKeywords(new ArrayList<String>() {{ add("Book Thief");add("book");add("Markus Zusak");add("$11.99");add("thief");}});
        allItems.add(new Book("The Color Purple", 12.99, "Alice Walker", "paperback","a black woman suffers abuse in the South", 0.55, 20));
        allItems.get(19).setKeywords(new ArrayList<String>() {{ add("The Color Purple");add("color");add("Alice Walker");add("$12.99");add("purple");}});
        allItems.add(new Book("The Great Gatsby", 9.50, "F Scott Fitzgerald", "hardcover","a millionare is obsessed with reuniting with his former love", 0.34, 21)); 
        allItems.get(20).setKeywords(new ArrayList<String>() {{ add("The Great Gatsby");add("gatsby");add("F Scott Fitzgerald");add("$9.50");}});
        allItems.add(new Book("The Hate U Give" , 11.99, "Angie Thomas","hardcover", "a girl witnesses the tragic death of her friend, sparking protests", 0.95, 22));
        allItems.get(21).setKeywords(new ArrayList<String>() {{ add("The Hate U Give");add("hate");add("Angie Thomas");add("$11.99");}});
        allItems.add(new Book("The Hitchhiker's Guide to the Galaxy", 20.00, "Douglas Adams", "hardcover","a guy gets into trouble while travelling galaxy", 0.25, 23)); 
        allItems.get(22).setKeywords(new ArrayList<String>() {{ add("The Hitchhiker's Guide to the Galaxy");add("for");add("Guide");add("$20");add("galaxy");}});
        allItems.add(new Book("Things Fall Apart", 14.50, "Chinua Achebe", "hardcover","depicts pre-colonial life in Nigeria", 1.36,24));
        allItems.get(23).setKeywords(new ArrayList<String>() {{ add("Things Fall Apart");add("Chinua Achebe");add("$14.50");add("fall");add("apart");}});
        allItems.add(new Book("To Kill a Mockingbird", 14.00, "Harper Lee", "paperback", "a lawyer defends a black man who was falsely accused by racists",0.37,25));
        allItems.get(24).setKeywords(new ArrayList<String>() {{ add("To Kill A Mockingbird");add("mockingbird");add("Harper Lee");add("$14");}});

        //energy          
        allItems.add(new Powerplant("100 kWh of energy", 200.00, "provides enough energy", 0.0, 26));
        allItems.get(25).setKeywords(new ArrayList<String>() {{ add("100 kWh");add("100 kWh of energy");add("$200");}}); 
        allItems.add(new Powerplant("150 kWh of energy",250, "provides enough energy", 0.0, 27));
        allItems.get(26).setKeywords(new ArrayList<String>() {{ add("150 kWh");add("150 kWh of energy");add("$250");}}); 
        allItems.add(new Powerplant("200 kWh of energy", 300, "provides enough energy", 0.0, 28));
        allItems.get(27).setKeywords(new ArrayList<String>() {{ add("200 kWh");add("200 kWh of energy");add("$300");}});
        allItems.add(new Powerplant("250 kWh of energy", 350, "provides enough energy", 0.0, 29));
        allItems.get(28).setKeywords(new ArrayList<String>() {{ add("250 kWh");add("250 kWh of energy");add("$350");}}); 
        allItems.add(new Powerplant("300 kwh of energy", 400, "provides enough energy", 0.0, 30));
        allItems.get(29).setKeywords(new ArrayList<String>() {{ add("300kWh");add("300 kWh of energy");add("$400");}});
        
        //password
        System.out.println("Create password");
        Scanner userInputScanner = new Scanner(System.in);
        String passwordscanned = userInputScanner.nextLine();
        System.out.println("Enter password");
        String userInputscanned = userInputScanner.nextLine();
        if (userInputscanned.equals(passwordscanned))
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
        boolean userIsStillShopping = true;
        boolean userIsStillSearching;
        List<Integer> validItem = new ArrayList<Integer>();
       
        while (userIsStillShopping)
        {
            System.out.println("Which item category do you want? Type b for books, c for computers, e for energy, or t for basketball tickets. You can also press s to search a specific product.");
            String userCategoryInput = userInputScanner.nextLine();
            if (userCategoryInput.equals("s") || userCategoryInput.equals("b")|| userCategoryInput.equals("t") || userCategoryInput.equals("c") || userCategoryInput.equals("e"))
            {
                if (userCategoryInput.equals("s"))
                {
                    userIsStillSearching = true;
                    while (userIsStillSearching)
                    {
                        System.out.println("What would you like to search?");
                        String userSearchInput  = userInputScanner.nextLine();
                    
                        StoreItem itemFoundInSearch = allItems.stream().filter(item -> item.keywords.contains(userSearchInput)).findAny().orElse(null);

                        if (itemFoundInSearch != null)
                        {
                            System.out.println("Found it! " + itemFoundInSearch.GetData(
                                new StoreItemFormatter(itemFoundInSearch.name, itemFoundInSearch.price, itemFoundInSearch.description, itemFoundInSearch.itemNum, itemFoundInSearch.keywords)
                            ));
                            System.out.println("Would you like to add this item to your cart? Type y for yes or n for no.");
                            String InputCart = userInputScanner.nextLine();
                       
                            if (InputCart.equals("y"))
                            {
                                shopCart.AddToCart(itemFoundInSearch);
                                System.out.println("Item has been added to your cart.");
                            }
                            else if (InputCart.equals("n"))
                            {
                                System.out.println("This item has not been added to your cart.");
                            }
                            else 
                            {
                                System.out.println("Invalid input.  The item was not added to your cart.");
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
                            String InputSearch = userInputScanner.nextLine();
                        
                            if (InputSearch.equals("n"))
                            {
                                userIsStillSearching = false;
                                didUserEnterValidInputForCartItem = true;
                            }
                            else if (InputSearch.equals("y"))
                            {
                                userIsStillSearching = true;
                                didUserEnterValidInputForCartItem = true;
                            }
                            else 
                            {
                                System.out.println("Invalid input. Would you like to keep searching? Type y for yes or n for no.");
                                didUserEnterValidInputForCartItem = false;
                            }
                        }
                    }
                }
                else if (userCategoryInput.equals("b") || userCategoryInput.equals("c") || userCategoryInput.equals("e") || userCategoryInput.equals("t"))
                {
                    validItem.clear();
                    boolean userIsStillAddingItemsFromMenu = true;
                    while (userIsStillAddingItemsFromMenu)
                    {
                        for (StoreItem item : allItems) 
                        {
                            StoreItemDataPrinter itemToPrint = new StoreItemDataPrinter(
                                new StoreItemFormatter(
                                    item.getName(),
                                    item.getPrice(),
                                    item.getDescription(),
                                    item.getItemNum(),
                                    item.getKeywords()
                                ), 
                                new RateTax()
                            );
                            
                            if (userCategoryInput.equals("b") && item instanceof Book) {                          
                                System.out.println(itemToPrint.PrintData());
                            }
                            else if (userCategoryInput.equals("c") && item instanceof Computer) {
                            System.out.println(itemToPrint.PrintData());
                            }
                            else if (userCategoryInput.equals("e") && item instanceof Powerplant) {
                                System.out.println(itemToPrint.PrintData());
                            
                            }
                            else if (userCategoryInput.equals("t") && item instanceof Basketball) {
                                System.out.println(itemToPrint.PrintData());
                            }
                        } 
                        if (userCategoryInput.equals("b")){validItem.add(16);validItem.add(17);validItem.add(18);validItem.add(19);validItem.add(20);validItem.add(21);validItem.add(22);validItem.add(23);validItem.add(24);validItem.add(25);}
                        else if (userCategoryInput.equals("t")){validItem.add(7);validItem.add(8);validItem.add(9);validItem.add(10);validItem.add(11);validItem.add(12);validItem.add(13);validItem.add(14);validItem.add(15);}
                        else if (userCategoryInput.equals("c")){validItem.add(1);validItem.add(2);validItem.add(3);validItem.add(4);validItem.add(5);validItem.add(6);}
                        else if (userCategoryInput.equals("e")){validItem.add(26);validItem.add(27);validItem.add(27);validItem.add(28);validItem.add(29);validItem.add(30);}
                        System.out.println("What would you like to buy? Please write an item number.");
                        String itemNumberTheUserChose  = userInputScanner.nextLine();
                        StoreItem foundItem = allItems.stream().filter(item -> item.itemNum == Integer.parseInt(itemNumberTheUserChose)).findAny().orElse(null);
                        Integer userItemNum = validItem.stream().filter(value -> value.intValue() == foundItem.itemNum).findAny().orElse(null);
                        if (foundItem != null && userItemNum != null) 
                        {
                            shopCart.AddToCart(foundItem);
                            System.out.println("This item has been added to cart: " + foundItem.name); 
                            System.out.println("Would you like to add another item from the respective category to the cart? Type y for yes or n for no.");
                        
                            boolean didUserEnterValidInputForFoundItem = false;
                            while (didUserEnterValidInputForFoundItem == false)
                            {
                                String doesUserWantToAddAnotherItem = userInputScanner.nextLine();
                            
                                if (doesUserWantToAddAnotherItem.equals("n"))
                                {
                                    didUserEnterValidInputForFoundItem = true;
                                    userIsStillAddingItemsFromMenu = false;
                                }
                                else if (doesUserWantToAddAnotherItem.equals("y"))
                                {
                                    didUserEnterValidInputForFoundItem = true;
                                    userIsStillAddingItemsFromMenu = true;
                                }
                                else 
                                {
                                    System.out.println("Invalid input. Would you like to add another item to the cart? Type y for yes or n for no.");
                                    didUserEnterValidInputForFoundItem = false;
                                }
                            }
                        }
                        else 
                        {
                            System.out.println("");
                            System.out.println("Invalid input. Please write a valid item number from the category you selected.");
                            System.out.println("");
                        }
                    }
                }
                System.out.println("Are you done shopping for today? Type y for yes or n for no.");
                boolean didUserEnterValidInput = false;
                while (didUserEnterValidInput == false) 
                {
                    String doneShoppingInput = userInputScanner.nextLine();
                    if (doneShoppingInput.equals("y"))
                    {
                        shopCart.PrintItems();
                        didUserEnterValidInput = true;
                        userIsStillShopping = false;
                    }
                    else if (doneShoppingInput.equals("n"))
                    {
                        didUserEnterValidInput = true;
                        userIsStillShopping = true;
                    }
                    else 
                    {
                        System.out.println("Invalid input. Are you done shopping for today? Type y for yes or n for no");
                        didUserEnterValidInput = false;
                    }
                }
            }
            else 
            {
                System.out.println("Invalid input.");
            }
        }
        userInputScanner.close();
    }
}
