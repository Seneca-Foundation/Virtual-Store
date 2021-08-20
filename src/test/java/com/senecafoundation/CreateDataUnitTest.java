package com.senecafoundation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
        StoreItem testItem = new StoreItem("test",5.99,"a test item");
        this.systemUnderTest.Create(testItem);
    }
}