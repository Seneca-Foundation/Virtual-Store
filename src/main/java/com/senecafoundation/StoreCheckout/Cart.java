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
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        String topMessage = String.join("Thank you for shopping with us. Here are your items and total:\n",
                    "--------------------------------------------------------\n",
                    "Item, Price\n",
                    "--------------------------------------------------------\n");
        //String itemsToBuy;
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
            
            //itemstoBuy += String.join(itemToPrint.PrintDataForCart());
            total = total + itemToPrint.getPrice();
        }
        String bottomMessage = String.join("\n--------------------------------------------------------\n",
                    "Total w/ Tax: $"+df.format(total),
                    "\nThank you for shopping with us! here's a discount code for next time 10OFF\n",  
                    "Follow us on instagram @VirtualStore21\n");
        String all = String.join(topMessage,bottomMessage);
        return all;
    }
}
