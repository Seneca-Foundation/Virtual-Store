public class WeightItem extends Storeitem
{
    protected int weight;
    public WeightItem(float price, String name, String description, int weight, int itemNum) {
        super(price, name, description, itemNum);
        this.weight = weight;
        
        
    }
    
}
