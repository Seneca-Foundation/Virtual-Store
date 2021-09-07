package com.senecafoundation.PriceChangersTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.UUID;

import com.senecafoundation.ITextFormatter;
import com.senecafoundation.StoreItemFormatter;
import com.senecafoundation.PriceChangers.RateDiscount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class RateDiscountTest {
    private RateDiscount systemUnderTest;
    @Mock private transient ITextFormatter item;

    @BeforeEach
    void createRateDiscount() {
        MockitoAnnotations.openMocks(this);
        when(item.getPrice()).thenReturn(10.00);
        doNothing().when(item).setPrice(anyDouble());
        this.systemUnderTest = new RateDiscount();
    }

    @Test
    void testUnitRateDiscount() {
        double priceReturned = this.systemUnderTest.ChangePriceToItem(item);
        assertEquals(10.00, priceReturned);
    }

    @Test
    void testInegrationRateDiscount() {
        ArrayList<String> keywords = new ArrayList<String>();
        keywords.add("test");
        StoreItemFormatter realItem = new StoreItemFormatter("Test Item", 10.00, "This is a test item", UUID.randomUUID(), keywords);
        double priceReturned = this.systemUnderTest.ChangePriceToItem(realItem);
        assertEquals(9.7, priceReturned);
    }}
