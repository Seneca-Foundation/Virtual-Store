package com.senecafoundation.StoreCheckoutTests;

import com.senecafoundation.ProductObjects.BookObjects.Book;
import com.senecafoundation.StoreCheckout.Cart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


public class CartTest {
    private Cart systemUnderTest;
    @Mock private transient Book myBook;

    @BeforeEach
    void createCart() {
        MockitoAnnotations.openMocks(this);
        when(myBook.getAuthor()).thenReturn("James Baldwin");
        when(myBook.getPrice()).thenReturn(5.00);
        when(myBook.getName()).thenReturn("Hunger Games");
        
        this.systemUnderTest = new Cart();
    }
    
    @Test
    void testAddToCartAndPrintItems() {
        this.systemUnderTest.AddToCart(this.myBook);
        assertEquals("Thank you for shopping with us. Here are your items and total:\n" +
                    "--------------------------------------------------------\n" + 
                    "Item, Price\n" +
                    "--------------------------------------------------------\n" +
                    "Hunger Games $5.10\n"+
                    "--------------------------------------------------------\n" +
                    "Total w/ Tax: $5.10\n"+
                    "Here's a discount code for your next purchase: 10OFF\n" +  
                    "Follow us on instagram @VirtualStore21", 
                    this.systemUnderTest.PrintItems());
    }
}
