package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasketballTest {   

    private Basketball systemUnderTest;

    @BeforeEach
    void assignMonster() {
        this.systemUnderTest = new Basketball("Chicago Bulls vs Phoenix Suns", 250.00,109, 30, "section is selling out fast","July 30", 0.2, 8);
    }

    @Test
    void testBasketballCreate() {
        assertEquals("Chicago Bulls vs Phoenix Suns", this.systemUnderTest.getName());
        assertEquals(250, this.systemUnderTest.getPrice());
        assertEquals(109, this.systemUnderTest.getSection());
        assertEquals(30, this.systemUnderTest.getSeat());
        assertEquals("section is selling out fast", this.systemUnderTest.getDescription());
        assertEquals(0.2, this.systemUnderTest.getWeight());
        assertEquals(8, this.systemUnderTest.getItemNum());
        assertEquals("July 30", this.systemUnderTest.getDate());
    }
    @Test
    void getData() {
        assertEquals("Match: Chicago Bulls vs Phoenix Suns, Price: $250, Date: July 30, Section: 109, Seat: 30, Weight: 0.2, Item Number: 8", this.systemUnderTest.GetData());


    }
}