package com.senecafoundation;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class StoreItemDataPrinter {
    
    private ITextFormatter itemToPrint;
    private IAddTax taxToAdd;

    public StoreItemDataPrinter(ITextFormatter itemToPrint, IAddTax taxToAdd) {
        this.itemToPrint = itemToPrint;
        this.taxToAdd = taxToAdd;
    }

    public String PrintData() {
        this.taxToAdd.AddTaxToItem(itemToPrint);
        return this.itemToPrint.GetData();
    }
    
    public String PrintDataForCart() {
        this.taxToAdd.AddTaxToItem(itemToPrint);
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        return this.itemToPrint.getName() + " $" + df.format(this.itemToPrint.getPrice());
    }

    public double getPrice() {
        return this.taxToAdd.AddTaxToItem(itemToPrint);
    }
}