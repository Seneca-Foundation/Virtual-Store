package com.senecafoundation.PriceChangersTests;

import com.senecafoundation.PriceChangers.RateDiscount;
import com.senecafoundation.PriceChangers.RateTax;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RateTaxTest {
    private RateDiscount systemUnderTest;

    @BeforeEach
    void createRateTax() {
        this.systemUnderTest = new RateDiscount();
    }
    @Test
    void testRateDiscount() {
        //this.systemUnderTest
    }
}
