public class Powerplant extends WeightItem
{
    public Powerplant(float price, String name, String description, int itemNum, int weight) 
    {
        super(price, name, description, itemNum, weight);
    
    }
    public String GetData(){
        return "Product: " + name + ", Price: " + price + ", Item Number: " + itemNum + ",weight:" + weight;
    }  
    
}
