package com.senecafoundation;

public class FlatTax implements IAddTax {

    @Override
    public double AddTaxToItem(ITextFormatter item) {
        item.setPrice(5 + item.getPrice());
        return item.getPrice();
        //$5
    }

}