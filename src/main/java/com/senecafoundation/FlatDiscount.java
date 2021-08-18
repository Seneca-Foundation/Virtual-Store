package com.senecafoundation;

public class FlatDiscount implements IChangePrice {

    @Override
    public double ChangePriceToItem(ITextFormatter item) {
        item.setPrice(5 - item.getPrice());
        return item.getPrice();
        //Discount of 5$
    }
}