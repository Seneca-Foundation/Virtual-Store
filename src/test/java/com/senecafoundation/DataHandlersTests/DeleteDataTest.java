package com.senecafoundation.DataHandlersTests;

import com.senecafoundation.StoreItem;
import com.senecafoundation.DataHandlers.DeleteData;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeleteDataTest {

    private DeleteData systemUnderTest;
            
    @BeforeEach
    void createDeleteDataTest() {
        this.systemUnderTest= new DeleteData();
        this.systemUnderTest.filepath = "./Objects.csv";
        this.systemUnderTest.tempFile = "./Temporary.csv";
    }

    @Test
    void testStoreItemDelete() {  
        StoreItem testItem = new StoreItem("test", 5.99, "a test item");
        this.systemUnderTest.Delete(testItem.getID());
    }
}

