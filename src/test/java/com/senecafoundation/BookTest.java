package com.senecafoundation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import com.senecafoundation.ProductObjects.Book;

public class BookTest {
   
    private Book systemUnderTest;

    @BeforeEach
    void assignMonster() {
        this.systemUnderTest = new Book(
            "Wuthering Heights", 
            19.99, 
            "Emily Bronte", 
            "Something cool", 
            "Gothic romance set in the moors of Haworth", 
            .5
        );
    }

    @Test 
    void testBookCreate() {
        assertEquals("Wuthering Heights", this.systemUnderTest.getName());
        assertEquals(19.99, this.systemUnderTest.getPrice());
        assertEquals("Emily Bronte", this.systemUnderTest.getAuthor());
        assertEquals("Something cool", this.systemUnderTest.getCover());
        assertEquals("Gothic romance set in the moors of Haworth", this.systemUnderTest.getDescription());
        assertEquals(.5, this.systemUnderTest.getWeight());
    }

    @Test
    void getData() {
        StoreItemFormatter formatter = new StoreItemFormatter(this.systemUnderTest.name, this.systemUnderTest.price, this.systemUnderTest.description, this.systemUnderTest.ID, this.systemUnderTest.keywords);
        assertEquals("Title: Wuthering Heights, Price: $19.99, Author: Emily Bronte, Cover: Something cool, Description: Gothic romance set in the moors of Haworth, Weight: 0.5, Item Number: " + this.systemUnderTest.getID(), this.systemUnderTest.GetData(formatter));
    }
}
