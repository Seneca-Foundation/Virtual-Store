package com.senecafoundation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.senecafoundation.DataHandlers.ReadData;
import com.senecafoundation.PriceChanger.RateTax;
import com.senecafoundation.ProductObjects.Basketball;
import com.senecafoundation.ProductObjects.BookObjects.Book;
import com.senecafoundation.ProductObjects.Computer;
import com.senecafoundation.ProductObjects.Powerplant;


public class App 
{
    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);

        Cart shopCart = new Cart();
        List<StoreItem> allItems;

        // Data creators and readers
        ReadData dataReader = new ReadData();
        dataReader.setFilepath("./Objects.csv");
        allItems = dataReader.ReadAll();
        User userThings = new User();
        //use Create for all the hardcoded StoreItems below
        allItems.get(0).setKeywords(new ArrayList<String>() {{ add("Asus");add("ROG");add("silver");add("AMD");add("Ryzen");add("5700xt");add("5600x"); ;}}); 
        allItems.get(1).setKeywords(new ArrayList<String>() {{ add("grey");add("Intel");add("11th generation");add("HP");add("HP Envy");   ;}});         
        allItems.get(2).setKeywords(new ArrayList<String>() {{ add("M1 chip");add("rose gold");add("MacBook");add("Mac");}}); 
        allItems.get(3).setKeywords(new ArrayList<String>() {{ add("blue");add("Nvidia");add("RTX 2070");add("Razer");}}); 
        allItems.get(4).setKeywords(new ArrayList<String>() {{ add("black");add("Touch screen");add("Surface Book");}}); 
        allItems.get(5).setKeywords(new ArrayList<String>() {{ add("red");add("tablet");add("Surface Pro");}}); 
     
        //basketball game tickets
        allItems.get(6).setKeywords(new ArrayList<String>() {{ add("Denver Nuggets");add("Brooklyn");add("Nets");add("Denver");add("Brooklyn Nets");}}); 
        allItems.get(7).setKeywords(new ArrayList<String>() {{ add("Bulls");add("Phoenix");add("Suns");add("Chicago");add("Phoenix Suns");add("Chicago Bulls");add("expensive");add("$250");}}); 
        allItems.get(8).setKeywords(new ArrayList<String>() {{ add("Denver Nuggets");add("Utah");add("Utah Jazz");add("cheapest");add("$139");}}); 
        allItems.get(9).setKeywords(new ArrayList<String>() {{ add("Indiana Pacer");add("Milwaukee Bucks");add("Bucks");add("Pacers");add("$194");}}); 
        allItems.get(10).setKeywords(new ArrayList<String>() {{ add("Laker");add("Boston");add("Celtics");add("great seats");add("$250");}}); 
        allItems.get(11).setKeywords(new ArrayList<String>() {{ add("New York Knicks");add("New York");add("Philadelphia");add("76ers");add("Philadelphia 76ers");add("$183");}}); 
        allItems.get(12).setKeywords(new ArrayList<String>() {{ add("Oklahoma City Thunder");add("Oklahoma City");add("Thunder");add("LA");add("Clippers");add("$192");}}); 
        allItems.get(13).setKeywords(new ArrayList<String>() {{ add("Phoenix Suns");add("Phoenix");add("Bucks");add("$150");}}); 
        allItems.get(14).setKeywords(new ArrayList<String>() {{ add("San Antonio Spurs");add("Spurs");add("San Antonio");add("Memphis");add("Grizzles");add("Memphis Grizzles");add("$195");}}); 
              
        //books
        allItems.get(15).setKeywords(new ArrayList<String>() {{ add("Giovanni");add("room");add("James Baldwin");add("$30");}});
        allItems.get(16).setKeywords(new ArrayList<String>() {{ add("Hunger");add("games");add("Suzanne Collins");add("$15");}});
        allItems.get(17).setKeywords(new ArrayList<String>() {{ add("Lord of the Flies");add("lord of the flies");add("William Colding");add("$11.30");}});
        allItems.get(18).setKeywords(new ArrayList<String>() {{ add("Book Thief");add("book");add("Markus Zusak");add("$11.99");add("thief");}});
        allItems.get(19).setKeywords(new ArrayList<String>() {{ add("The Color Purple");add("color");add("Alice Walker");add("$12.99");add("purple");}});
        allItems.get(20).setKeywords(new ArrayList<String>() {{ add("The Great Gatsby");add("gatsby");add("F Scott Fitzgerald");add("$9.50");}});
        allItems.get(21).setKeywords(new ArrayList<String>() {{ add("The Hate U Give");add("hate");add("Angie Thomas");add("$11.99");}});
        allItems.get(22).setKeywords(new ArrayList<String>() {{ add("Things Fall Apart");add("Chinua Achebe");add("$14.50");add("fall");add("apart");}});
        allItems.get(23).setKeywords(new ArrayList<String>() {{ add("To Kill A Mockingbird");add("mockingbird");add("Harper Lee");add("$14");}});

        //energy          
        allItems.get(24).setKeywords(new ArrayList<String>() {{ add("100 kWh");add("100 kWh of energy");add("$200");}}); 
        allItems.get(25).setKeywords(new ArrayList<String>() {{ add("150 kWh");add("150 kWh of energy");add("$250");}}); 
        allItems.get(26).setKeywords(new ArrayList<String>() {{ add("200 kWh");add("200 kWh of energy");add("$300");}});
        allItems.get(27).setKeywords(new ArrayList<String>() {{ add("250 kWh");add("250 kWh of energy");add("$350");}}); 
        allItems.get(28).setKeywords(new ArrayList<String>() {{ add("300kWh");add("300 kWh of energy");add("$400");}});
    
        // Menu
        System.out.println("");
        System.out.println("Welcome! This is what we offer");
        System.out.println("Books");
        System.out.println("Computers");
        System.out.println("Basketball tickets");
        System.out.println("Energy");
        boolean userIsStillShopping = true;
        boolean userIsStillSearching;
       
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
                                new StoreItemFormatter(itemFoundInSearch.name, itemFoundInSearch.price, itemFoundInSearch.description, itemFoundInSearch.ID, itemFoundInSearch.keywords)
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
                    boolean userIsStillAddingItemsFromMenu = true;
                    while (userIsStillAddingItemsFromMenu)
                    {
                        for (StoreItem product : allItems) 
                        {
                            
                            StoreItemDataPrinter itemToPrint = new StoreItemDataPrinter(
                                new StoreItemFormatter(
                                    product.getName(),
                                    product.getPrice(),
                                    product.getDescription(),
                                    product.getID(),
                                    product.getKeywords()
                                ), 
                                new RateTax()
                            );
                            
                            if (userCategoryInput.equals("b") && product instanceof Book) {   
                                System.out.println(itemToPrint.PrintData());                       
                            }
                            else if (userCategoryInput.equals("c") && product instanceof Computer) {
                                System.out.println(itemToPrint.PrintData());
                            }
                            else if (userCategoryInput.equals("e") && product instanceof Powerplant) {
                                System.out.println(itemToPrint.PrintData());
                            
                            }
                            else if (userCategoryInput.equals("t") && product instanceof Basketball) {
                                System.out.println(itemToPrint.PrintData());
                            }
                        }
                        System.out.println("What would you like to buy? Please write an item number.");
                        String itemNumberTheUserChose  = userInputScanner.nextLine();
                        StoreItem foundItem = allItems.stream().filter(item -> item.ID.toString().equals(itemNumberTheUserChose)).findAny().orElse(null);
                        
                        if (foundItem != null) 
                        {
                            shopCart.AddToCart(foundItem);
                            System.out.println("This item has been added to cart: " + foundItem.name); 
                            System.out.println("Would you like to add another item from the current category to the cart? Type y for yes or n for no.");
                        
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
                        System.out.println("To checkout, you need to login or create an account. Press l to login or c to create account.");
                        String userCheckout = userInputScanner.nextLine();
                        if (userCheckout.equals("l"))
                        {
                            System.out.println("Enter username.");
                            String userInputUsername = userInputScanner.nextLine();
                            System.out.println("Enter password");
                            String userInputPassword = userInputScanner.nextLine();
                            userThings.verifyLogin(userInputUsername, userInputPassword);
                        }
                        else if (userCheckout.equals("c")) {
                            System.out.println("Enter the username you would like.");
                            String usernameCreated = userInputScanner.nextLine();
                            System.out.println("Enter the password you would like.");
                            String passwordCreated = userInputScanner.nextLine();
                            userThings.createAccount(usernameCreated, passwordCreated);
                        }
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

