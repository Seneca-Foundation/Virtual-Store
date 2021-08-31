package com.senecafoundation.PriceChangers;

import com.senecafoundation.ITextFormatter;

public class FlatDiscount implements IChangePrice {

    @Override
    public double ChangePriceToItem(ITextFormatter item) {
        item.setPrice(item.getPrice() - 5);
        return item.getPrice();
        //Discount of 5$
    }
}