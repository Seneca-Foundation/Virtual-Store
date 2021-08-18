package com.senecafoundation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

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
        assertEquals("Wuthering Heights", this.systemUnderTest.name);
        assertEquals(19.99, this.systemUnderTest.price);
        assertEquals("Emily Bronte", this.systemUnderTest.author);
        assertEquals("Something cool", this.systemUnderTest.cover);
        assertEquals("Gothic romance set in the moors of Haworth", this.systemUnderTest.description);
        assertEquals(.5, this.systemUnderTest.weight);
    }

    @Test
    void getData() {
        assertEquals(
            "Title: Wuthering Heights, Price: $19.99, Author: Emily Bronte, Cover: Something cool, Description: Gothic romance set in the moors of Haworth, Weight: 0.5, Item Number: 5",
            this.systemUnderTest.GetData()
        );
    }
}
