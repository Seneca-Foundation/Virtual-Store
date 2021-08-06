import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Powerplant extends WeightItem
{
    public Powerplant(String name, double price,  String description, double weight, int itemNum) 
    {
        super(name,price,description, weight, itemNum);
    }
    public String GetData(){
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        return "Product: " + name + ", Price: $" + df.format(price) + ", Weight:" + weight + ", Item Number: " + itemNum;
    }  
    
}
