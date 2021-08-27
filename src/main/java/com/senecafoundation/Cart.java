package com.senecafoundation;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.senecafoundation.PriceChangers.RateTax;

public class Cart{

    protected List<StoreItem> storeItemsToPurchase;
    protected double total;
    
    public Cart()
    {
        storeItemsToPurchase = new ArrayList<StoreItem>();
    }
    
    public void AddToCart(StoreItem itemToAdd) {
        storeItemsToPurchase.add(itemToAdd);
    }

    public void PrintItems() {
        System.out.println("Thank you for shopping with us. Here are your items and total:");
        System.out.println("--------------------------------------------------------");
        System.out.println("Item, Price" );
        System.out.println("--------------------------------------------------------");
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        for (StoreItem item : storeItemsToPurchase)
        {
            StoreItemDataPrinter itemToPrint = new StoreItemDataPrinter(
                                new StoreItemFormatter(
                                    item.getName(),
                                    item.getPrice(),
                                    item.getDescription(),
                                    item.getID(),
                                    item.getKeywords()
                                ), 
                                new RateTax()
                            );
            
            System.out.println(itemToPrint.PrintDataForCart());
            total = total + itemToPrint.getPrice();
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Total w/ Tax: $" + df.format(total));
    
       System.out.println("Thank you for shopping with us! here's a discount code for next time 10OFF");   
       System.out.println("Follow us on instagram @VirtualStore21");
    }
}
