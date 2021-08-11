package com.senecafoundation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;



public class PowerPlantTest {
    
    private Powerplant systemUnderTest;

 @BeforeEach
 void assignMonster() {
     this.systemUnderTest = new Powerplant(
    "100 kWh",
    200, //price
    "Provides enough energy", 
    0.0, //weight
    26 //item number
    );
}

@Test
void testEnergycreate() {
    assertEquals("100 kWh", systemUnderTest.name);
    assertEquals(200, systemUnderTest.price);
    assertEquals("Provides enough energy", systemUnderTest.description);
    assertEquals(0.0, systemUnderTest.weight);
    assertEquals(26, systemUnderTest.itemNum);
}
@Test
void testPowerPlantGetData() {
    assertEquals(
        "Product: 100 kWh, Price: $200, Weight:0.0, Item Number: 26",
        this.systemUnderTest.GetData()
    );    

    }
}
