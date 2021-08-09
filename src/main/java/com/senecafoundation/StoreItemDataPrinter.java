package com.senecafoundation;

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
}