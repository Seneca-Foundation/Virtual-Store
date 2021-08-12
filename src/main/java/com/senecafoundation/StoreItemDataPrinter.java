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
    //dependency injection is that you're depending on another class (or interface), and injecting, passing, the dependncy in as parameter
    //hard coded is if you cannot change the value of a variable
}