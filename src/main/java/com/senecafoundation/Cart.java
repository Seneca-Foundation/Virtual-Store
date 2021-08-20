package com.senecafoundation;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

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
// after displaying total, let the user select if they had a great purchase rate 1 to 5

//2nd idea; after displaying total, store will display a promocode for the future

//3rd idea; after displaying total store will printout "follow us on instagram etc."