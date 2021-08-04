public class WeightItem extends Storeitem
{
    protected double weight;
    public WeightItem(String name, double price, String description, double weight, int itemNum) {
        super(name, price, description, itemNum);
        this.weight = weight;
        
        
    }
    
}
