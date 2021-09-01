package com.senecafoundation.DataHandlersTests;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.lang.String;

import com.senecafoundation.DataHandlers.CreateData;
import com.senecafoundation.ProductObjects.Basketball;
import com.senecafoundation.ProductObjects.Computer;
import com.senecafoundation.ProductObjects.Powerplant;
import com.senecafoundation.ProductObjects.BookObjects.Book;
import com.senecafoundation.ProductObjects.BookObjects.Textbook;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class CreateDataUnitTest {
    
    private CreateData systemUnderTest;

    @BeforeEach
    void createCreateData() {
        this.systemUnderTest = new CreateData();
        this.systemUnderTest.filepath = "./Objects.csv";
    }

    @Test
    void testStoreItemCreate() {
        //StoreItem testItem = new StoreItem("test",5.99,"a test item");
        Computer testComp = new Computer("Asus ROG Zephyrus", 1549.99, "silver", "Windows", "AMD 5700xt and Ryzen 5600x", "2021",3.5);
        this.systemUnderTest.Create(testComp);
    }
    
    public void testSeedStoreData() {
        this.systemUnderTest.Create(new Computer("Asus ROG Zephyrus", 1549.99, "silver", "Windows", "AMD 5700xt and Ryzen 5600x", "2021",3.5));
        this.systemUnderTest.Create(new Computer("HP Envy", 1000.99 , "Grey", "Window", "11th Generation Intel", "2019", 2.71));
        this.systemUnderTest.Create(new Computer("MacBook Air",900.00, "rose gold","Apple", "New with M1 chip", "2021",2.8)); 
        this.systemUnderTest.Create(new Computer("Razer Blade 15", 700.00, "blue", "Windows","Advanced laptop w/ Nvidia RTX 2070", "2021",4.63));
        this.systemUnderTest.Create(new Computer("Surface Book 3",1599.99,"black", "Windows", "Touch screen ", "2020", 4.2)); 
        this.systemUnderTest.Create(new Computer("Surface Pro 7",700.00,"red", "Windows", "laptop and tablet in one","2021",1.74)); 
     
        //basketball game tickets
        this.systemUnderTest.Create(new Basketball("Brooklyn Nets vs Denver Nuggets",100,50, 24,"empty","October 11",0.2));
        this.systemUnderTest.Create(new Basketball("Chicago Bulls vs Phoenix Suns", 250.00,109, 30, "section is selling out fast","July 30", 0.2));
        this.systemUnderTest.Create(new Basketball("Denver Nuggets vs Utah Jazz", 139,194, 49,"empty", "April 6", 0.2));
        this.systemUnderTest.Create(new Basketball("Indiana Pacers vs Milwaukee Bucks", 194, 103, 53,"empty", "June 3", 0.2));
        this.systemUnderTest.Create(new Basketball("LA Lakers vs Boston Celtics", 250.00,48, 15, "empty","September 24",0.2));        
        this.systemUnderTest.Create(new Basketball("New York Knicks vs Philadelphia 76ers", 183,140, 49, "empty", "July 3",0.2)); 
        this.systemUnderTest.Create(new Basketball("Oklahoma City Thunder vs LA Clippers", 192, 102, 43,"empty","January 3", 0.2));
        this.systemUnderTest.Create(new Basketball("Phoenix Suns vs Bucks", 150, 80, 20, "empty","August 2", 0.2));
        this.systemUnderTest.Create(new Basketball("San Antonio Spurs vs Memphis Grizzles",195, 34, 193,"empty", "January 5",0.2)); 
              
        //books
        this.systemUnderTest.Create(new Book("Giovanni's Room", 30.00, "James Baldwin","paperback", "engaged man has an affair with a bartender", 0.51)); 
        this.systemUnderTest.Create(new Book("Hunger Games", 15.00, "Suzanne Collins", "hardcover", "24 teens fight each other until one is left standing", 0.7)); 
        this.systemUnderTest.Create(new Book("Lord of the Flies", 11.30, "William Colding", "paperback","young boys are stranded on an island & chaos ensues", 0.3));
        this.systemUnderTest.Create(new Book("The Book Thief", 11.99, "Markus Zusak", "paperback", "a girl steals books during WWII", 0.97)); 
        this.systemUnderTest.Create(new Book("The Color Purple", 12.99, "Alice Walker", "paperback","a black woman suffers abuse in the South", 0.55));
        this.systemUnderTest.Create(new Book("The Great Gatsby", 9.50, "F Scott Fitzgerald", "hardcover","a millionare is obsessed with reuniting with his former love", 0.34)); 
        this.systemUnderTest.Create(new Book("The Hate U Give" , 11.99, "Angie Thomas","hardcover", "a girl witnesses the tragic death of her friend which sparks protests", 0.95));
        this.systemUnderTest.Create(new Book("Things Fall Apart", 14.50, "Chinua Achebe", "hardcover","depicts pre-colonial life in Nigeria", 1.36));
        this.systemUnderTest.Create(new Book("To Kill a Mockingbird", 14.00, "Harper Lee", "paperback", "a lawyer defends a black man who was falsely accused by racists",0.37));

        //energy          
        this.systemUnderTest.Create(new Powerplant("400 kWh of energy", 500.00, "provides enough energy", 0.0));
        this.systemUnderTest.Create(new Powerplant("150 kWh of energy", 250, "provides enough energy", 0.0));
        this.systemUnderTest.Create(new Powerplant("200 kWh of energy", 300, "provides enough energy", 0.0));
        this.systemUnderTest.Create(new Powerplant("250 kWh of energy", 350, "provides enough energy", 0.0));
        this.systemUnderTest.Create(new Powerplant("300 kwh of energy", 400, "provides enough energy", 0.0));  
        //String name, double price, String author, String cover, String description, List<String> authors, double weight
        this.systemUnderTest.Create(new Textbook("Electronics Fundamentals",143.99,"empty","hardcover","dc/ac circuits & basic sold state circuits",new ArrayList<String>(){{add("Thomas L. Floyd");add("David M. Buchla");}},2.50));
    }

}