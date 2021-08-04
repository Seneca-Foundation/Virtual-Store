public class Powerplant extends WeightItem
{
    public Powerplant(float price, String name, String description, int weight, int itemNum) 
    {
        super(price, name, description, weight, itemNum);
    
    }
    public String GetData(){
        return "Product: " + name + ", Price: " + price + ", Weight:" + weight + ", Item Number: " + itemNum;
    }  
    
}
