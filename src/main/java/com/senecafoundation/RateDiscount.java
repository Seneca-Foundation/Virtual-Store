package com.senecafoundation;

    public class RateDiscount implements IChangePrice{ 

        
    @Override
    public double ChangePriceToItem(ITextFormatter item) {
        item.setPrice(item.getPrice() + (item.getPrice() - .03));
        return item.getPrice();
        //Three percent discount from price
    }
}