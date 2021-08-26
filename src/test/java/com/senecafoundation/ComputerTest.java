package com.senecafoundation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class ComputerTest {
    
    private Computer systemUnderTest;

    @BeforeEach
    void assignMonster() {
        this.systemUnderTest = new Computer("MacBook Air",900.00, "rose gold","Apple", "New with M1 chip", "2021",2.8);
    }

    @Test
    void testComputerCreate() {
        assertEquals("MacBook Air", this.systemUnderTest.getName());
        assertEquals(900.00, this.systemUnderTest.getPrice());
        assertEquals("rose gold", this.systemUnderTest.getColor());
        assertEquals("Apple", this.systemUnderTest.getComputerBrand());
        assertEquals("New with M1 chip", this.systemUnderTest.getDescription());
        assertEquals("2021", this.systemUnderTest.getReleaseDate());
        assertEquals(2.8, this.systemUnderTest.getWeight());
    }

    @Test
    void testComputerGetData() {
        StoreItemFormatter formatter = new StoreItemFormatter(this.systemUnderTest.name, this.systemUnderTest.price, this.systemUnderTest.description, this.systemUnderTest.ID, this.systemUnderTest.keywords);
        assertEquals("Computer: MacBook Air, Price: $900, Color: rose gold, Computer Brand: Apple, Description: New with M1 chip, Release Date: 2021, Weight: 2.8 pounds, Item Number: " + this.systemUnderTest.ID, this.systemUnderTest.GetData(formatter));
    }
}