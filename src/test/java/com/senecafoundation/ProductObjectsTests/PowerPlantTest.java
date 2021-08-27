package com.senecafoundation.ProductObjectsTests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.senecafoundation.StoreItemFormatter;
import com.senecafoundation.ProductObjects.Powerplant;

import org.junit.jupiter.api.BeforeEach;

public class PowerPlantTest {
    
    private Powerplant systemUnderTest;

    @BeforeEach
    void assignMonster() {
        this.systemUnderTest = new Powerplant(
        "100 kWh",
        200, //price
        "Provides enough energy", 
        0.0 //weight
        );
    }

    @Test
    void testEnergycreate() {
        assertEquals("100 kWh", systemUnderTest.name);
        assertEquals(200, systemUnderTest.price);
        assertEquals("Provides enough energy", systemUnderTest.description);
        assertEquals(0.0, systemUnderTest.weight);
    }

    @Test
    void getData() {
        StoreItemFormatter formatter = new StoreItemFormatter(this.systemUnderTest.name, this.systemUnderTest.price, this.systemUnderTest.description, this.systemUnderTest.ID, this.systemUnderTest.keywords);
        assertEquals("Product: 100 kWh, Price: $200, Weight:0.0, Item Number: " + this.systemUnderTest.ID, this.systemUnderTest.GetData(formatter));
    }
}
