package com.senecafoundation.PriceChangersTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.UUID;

import com.senecafoundation.ITextFormatter;
import com.senecafoundation.StoreItemFormatter;
import com.senecafoundation.PriceChangers.FlatTax;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class FlatTaxTest {
    private FlatTax systemUnderTest;
    @Mock private transient ITextFormatter item;
    
    @BeforeEach
    void createFlatTax() {
        MockitoAnnotations.openMocks(this);    
        when(item.getPrice()).thenReturn(15.00);
        doNothing().when(item).setPrice(anyDouble());
        this.systemUnderTest = new FlatTax();

    }
    @Test
    void testFlatTax() {
        double priceReturned = this.systemUnderTest.ChangePriceToItem(item);
        assertEquals(15.00, priceReturned);
    }
    @Test
    void testIntegrationFlatTax() {
        ArrayList<String> keywords = new ArrayList<String>();
        keywords.add("test");
        StoreItemFormatter realItem = new StoreItemFormatter("Test Item", 10.00, "FlatTax test", UUID.randomUUID(), keywords);
        double priceReturned = this.systemUnderTest.ChangePriceToItem(realItem);
        assertEquals(15.0, priceReturned);
    }

}
