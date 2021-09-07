package com.senecafoundation.PriceChangersTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.UUID;

import com.senecafoundation.ITextFormatter;
import com.senecafoundation.StoreItemFormatter;
import com.senecafoundation.PriceChangers.FlatDiscount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class FlatDiscountTest {
    private FlatDiscount systemUnderTest;
    @Mock private transient ITextFormatter item;

    @BeforeEach
    void createFlatDiscount() {
        MockitoAnnotations.openMocks(this);
        when(item.getPrice()).thenReturn(12.00);
        doNothing().when(item).setPrice(anyDouble());
        this.systemUnderTest = new FlatDiscount();
    
    }  
    @Test
    void testUnitFlatDiscount() {
        double priceReturned = this.systemUnderTest.ChangePriceToItem(item);
        assertEquals(12.00, priceReturned);
    
    }

    @Test
    void testInegrationFlatDiscount() {
        ArrayList<String> keywords = new ArrayList<String>();
        keywords.add("test");
        StoreItemFormatter realItem = new StoreItemFormatter("Test", 12.00, "This an item to test", UUID.randomUUID(), keywords);
        Double priceReturned = this.systemUnderTest.ChangePriceToItem(realItem);
        assertEquals(7.0, priceReturned);
    }
}
