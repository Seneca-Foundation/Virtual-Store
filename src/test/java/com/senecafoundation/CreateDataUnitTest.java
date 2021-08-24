package com.senecafoundation;

import org.junit.jupiter.api.Test;
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
}