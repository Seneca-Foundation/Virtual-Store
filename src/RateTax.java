//import java.math.RoundingMode;
//import java.text.DecimalFormat;
public class RateTax implements IAddTax {

    @Override
    public double AddTaxToItem(ITextFormatter item) {
        item.setPrice(item.getPrice() + (item.getPrice() * .02));
        return item.getPrice();
    }

}
