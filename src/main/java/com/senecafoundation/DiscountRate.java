package com.senecafoundation;

    public class DiscountRate implements IAddDiscount {

    @Override
    public double AddDiscountToItem(ITextFormatter item) {
        item.setPrice(10 - item.getPrice());
        return item.getPrice();
    }
    
}
