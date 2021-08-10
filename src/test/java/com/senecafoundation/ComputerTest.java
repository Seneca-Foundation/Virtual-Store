package com.senecafoundation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class ComputerTest {
    
        private Computer systemUnderTest;

        @BeforeEach
        void assignMonster() {
            this.systemUnderTest = new Computer(
                "iMac",
                200.95,
                "Apple",
                "Cyan",
                "cool",
                2012,
                1,
                3
            );
        }

        @Test
        void testComputerCreate() {
            assertEquals("iMac", this.systemUnderTest.name);
            assertEquals(200.95, this.systemUnderTest.price);
            assertEquals("Cyan", this.systemUnderTest.color);
            assertEquals("Apple", this.systemUnderTest.computerBrand);
            assertEquals("cool", this.systemUnderTest.description);
            assertEquals(2012, this.systemUnderTest.releaseDate);
            assertEquals(1, this.systemUnderTest.weight);
            assertEquals(3, this.systemUnderTest.itemNum);
        }
}
