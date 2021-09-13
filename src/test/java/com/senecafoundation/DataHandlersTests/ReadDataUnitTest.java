package com.senecafoundation.DataHandlersTests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.util.ArrayList;
//import java.util.UUID;

import com.senecafoundation.FundamentalObjects.StoreItem;
import com.senecafoundation.DataHandlers.CreateData;
import com.senecafoundation.DataHandlers.ReadData;
import com.senecafoundation.ProductObjects.Basketball;
import com.senecafoundation.ProductObjects.Computer;
import com.senecafoundation.ProductObjects.Powerplant;
import com.senecafoundation.ProductObjects.BookObjects.Book;
import com.senecafoundation.ProductObjects.BookObjects.ComicBook;
import com.senecafoundation.ProductObjects.BookObjects.Textbook;
import com.senecafoundation.ProductObjects.BookObjects.UsedBook;

import org.junit.jupiter.api.BeforeEach;

public class ReadDataUnitTest {
    
    private CreateData createItem;
    private ReadData systemUnderTest;

    @BeforeEach
    void createCreateData() {
        this.createItem = new CreateData();
        this.createItem.filepath = "./Objects.csv";
        this.systemUnderTest = new ReadData();
        this.systemUnderTest.setFilepath("./Objects.csv");
    }
    
    @Test
    void testStoreItemCreate() {
        StoreItem testItem = new StoreItem("test",5.99,"a test item");
        this.createItem.Create(testItem);
        StoreItem readItem = this.systemUnderTest.Read(testItem.getID());
        assertEquals(testItem.getID(), readItem.getID());
    }
    /*
    void testRead() {
        this.createItem.Create(new Computer("Asus ROG Zephyrus", 1549.99, "silver", "Windows", "AMD 5700xt and Ryzen 5600x", "2021",3.5));
        String numToTest = "3f29db87-80e8-4556bb8c-4f0caba2a7da";
        UUID idToTest = UUID.fromString(numToTest);
        this.systemUnderTest.Read(idToTest);
    }
    */
    @Test
    void testReadAll() {
        File toDelete = new File(this.createItem.filepath);
        toDelete.delete();
        this.createItem.Create(new Computer("Asus ROG Zephyrus", 1549.99, "silver", "Windows", "AMD 5700xt and Ryzen 5600x", "2021",3.5));
        this.createItem.Create(new Computer("HP Envy", 1000.99 , "Grey", "Window", "11th Generation Intel", "2019", 2.71));
     
        //basketball game tickets
        this.createItem.Create(new Basketball("Brooklyn Nets vs Denver Nuggets",100,50, 24,"empty","October 11",0.2));
        this.createItem.Create(new Basketball("Chicago Bulls vs Phoenix Suns", 250.00,109, 30, "section is selling out fast","July 30", 0.2));
             
        //books
        this.createItem.Create(new Book("Giovanni's Room", 30.00, "James Baldwin","paperback", "engaged man has an affair with a bartender", 0.51)); 
        this.createItem.Create(new Book("Hunger Games", 15.00, "Suzanne Collins", "hardcover", "24 teens fight each other until one is left standing", 0.7)); 

        //energy          
        this.createItem.Create(new Powerplant("400 kWh of energy", 500.00, "provides enough energy", 0.0));
        this.createItem.Create(new Textbook("Electronics Fundamentals",143.99,"empty","hardcover","dc/ac circuits & basic sold state circuits",new ArrayList<String>(){{add("Thomas L. Floyd");add("David M. Buchla");}},2.50));
        this.createItem.Create(new ComicBook("The Amazing Spider-Man",11.00,"David Morrell","paperback","Spider-man saves the city","Stan Lee",0.20));
        this.createItem.Create(new UsedBook("Fahrenheit 451",3.36,"Ray Bradbury","paperback","authoritarian government outlaws & burns books","acceptable",0.55));
        ArrayList<StoreItem> allItemsFromFile = (ArrayList<StoreItem>) this.systemUnderTest.ReadAll();
        assertEquals(allItemsFromFile.size(), 10);
    }
}