public class WeightItem extends Storeitem
{
    protected int weight;
    public WeightItem(float price, String name, String description, int itemNum, int weight) {
        super(price, name, description, itemNum);
        this.weight = weight;
        
        
    }
    
}
