package com.senecafoundation.StoreCheckout;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.senecafoundation.FundamentalObjects.StoreItem;
import com.senecafoundation.StoreItemDataPrinter;
import com.senecafoundation.StoreItemFormatter;
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

    public String PrintItems() {
        DecimalFormat df = new DecimalFormat("#.00");
        df.setRoundingMode(RoundingMode.CEILING);
        String topMessage = String.join("\n", "Thank you for shopping with us. Here are your items and total:",
                    "--------------------------------------------------------",
                    "Item, Price",
                    "--------------------------------------------------------");
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
            
            topMessage = topMessage + "\n"+itemToPrint.PrintDataForCart();
            total = total + itemToPrint.getPrice();
        }
        String bottomMessage = String.join("\n","--------------------------------------------------------",
                    "Total w/ Tax: $"+df.format(total),
                    "Here's a discount code for your next purchase: 10OFF",  
                    "Follow us on instagram @VirtualStore21");
        String all = String.join("\n",topMessage,bottomMessage);
        return all;
    }
}
