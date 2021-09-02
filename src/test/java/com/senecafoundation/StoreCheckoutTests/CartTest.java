package com.senecafoundation.StoreCheckoutTests;

import com.senecafoundation.ProductObjects.BookObjects.Book;
import com.senecafoundation.StoreCheckout.Cart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;


public class CartTest {
    private Cart systemUnderTest;
    @Mock private transient Book myBook;

    @BeforeEach
    void createCart() {
        MockitoAnnotations.openMocks(this);
        when(myBook.getAuthor()).thenReturn("James Baldwin");

        this.systemUnderTest = new Cart();
    }
    
    @Test
    void testAddToCartAndPrintItems() {
        this.systemUnderTest.AddToCart(this.myBook);
        this.systemUnderTest.PrintItems();
    }
        

}
