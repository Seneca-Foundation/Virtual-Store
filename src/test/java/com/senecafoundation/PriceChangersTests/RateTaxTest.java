package com.senecafoundation.PriceChangersTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.UUID;

import com.senecafoundation.ITextFormatter;
import com.senecafoundation.StoreItemFormatter;
import com.senecafoundation.PriceChangers.RateTax;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class RateTaxTest {
    private RateTax systemUnderTest;
    @Mock private transient ITextFormatter item;

    @BeforeEach
    void createRateTax() {
        MockitoAnnotations.openMocks(this);
        when(item.getPrice()).thenReturn(5.00);
        doNothing().when(item).setPrice(anyDouble());
        this.systemUnderTest = new RateTax();
    }
    @Test
    void testUnitRateTax() {
        double priceReturned = this.systemUnderTest.ChangePriceToItem(item);
        assertEquals(5.00, priceReturned); 
    }
    @Test
    void testIntegrationRateTax() {
        ArrayList<String> keywords = new ArrayList<String>();
        keywords.add("test");
        StoreItemFormatter realItem = new StoreItemFormatter("Test Item", 5.00, "This is a test", UUID.randomUUID(), keywords);
        Double priceReturned = this.systemUnderTest.ChangePriceToItem(realItem);
        assertEquals(5.1, priceReturned);
    }
}
