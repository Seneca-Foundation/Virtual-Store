package com.senecafoundation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

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

    @Test
    void testReadAll() {
        ArrayList<StoreItem> allItemsFromFile = (ArrayList<StoreItem>) this.systemUnderTest.ReadAll();
        assertEquals(allItemsFromFile.size(), 29);
    }
}