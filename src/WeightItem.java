public class WeightItem extends Storeitem
{
    protected int weight;
    public WeightItem(String name, double price, String description, int weight, int itemNum) {
        super(name, price, description, itemNum);
        this.weight = weight;
        
        
    }
    
}
