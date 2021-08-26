package com.senecafoundation.PriceChanger;

import com.senecafoundation.ITextFormatter;

public class FlatTax implements IChangePrice {

    @Override
    public double ChangePriceToItem(ITextFormatter item) {
        item.setPrice(5 + item.getPrice());
        return item.getPrice();
        //$5
    }

}
