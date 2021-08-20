package com.senecafoundation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UpdateDataTest {

    private UpdateData systemUnderTest;
    @BeforeEach
    void createDeleteDataTest() {
        this.systemUnderTest = new UpdateData();
        this.systemUnderTest.filepath = "./Objects.csv";
    }
    
    @Test
    void testStoreItemDelete() {   
        StoreItem testItem = new StoreItem("test",5.99,"a test item");
        this.systemUnderTest.Update(testItem);
    }

}