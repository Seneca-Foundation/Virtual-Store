package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import jdk.jfr.Timestamp;

public class BasketballTest {
    

private Basketball systemUnderTest;

@BeforeEach
void assignMonster() {
    this.systemUnderTest = new Basketball ("Chicago Bulls vs Phoenix Suns", "250", "July 30", "109","ToughMatch", "30", "7" ){




    }






@Test
void testBasketballCreate() {
    assertEquals("ChicagoBulls vs PhoenixSuns", this.systemUnderTest.name);
    assertEquals("250, this.systemUnderTest.price);"
    assertEquals("Relasedate", this.systemUnderTest.Releasedate);
    assertEquals("Section", this.systemUnderTest.Section);
    assertEquals("Toughmatch", this.systemUnderTest.description);
    assertEquals(30, this.systemUnderTest.weight);
    assertEquals(7, this.systemUnderTest.itemNum);
}

}









@Test
void getData() {


}