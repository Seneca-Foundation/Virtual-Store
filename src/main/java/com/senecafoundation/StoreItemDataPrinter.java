package com.senecafoundation;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import com.senecafoundation.PriceChangers.IChangePrice;

public class StoreItemDataPrinter {
    
    private ITextFormatter itemToPrint;
    private IChangePrice taxToAdd;

    public StoreItemDataPrinter(ITextFormatter itemToPrint, IChangePrice taxToAdd) {
        this.itemToPrint = itemToPrint;
        this.taxToAdd = taxToAdd;
    }

    public String PrintData() {
        this.taxToAdd.ChangePriceToItem(itemToPrint);
        return this.itemToPrint.GetData();
    }
    
    public String PrintDataForCart() {
        this.taxToAdd.ChangePriceToItem(itemToPrint);
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        return this.itemToPrint.getName() + " $" + df.format(this.itemToPrint.getPrice());
    }

    public double getPrice() {
        return this.taxToAdd.ChangePriceToItem(itemToPrint);
    }
}