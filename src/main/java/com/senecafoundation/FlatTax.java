package com.senecafoundation;

public class FlatTax implements IChangePrice {

    @Override
    public double ChangePriceToItem(ITextFormatter item) {
        item.setPrice(5 + item.getPrice());
        return item.getPrice();
        //$5
    }

}