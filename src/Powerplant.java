public class Powerplant extends WeightItem
{
    public Powerplant(String name, double price,  String description, int weight, int itemNum) 
    {
        super(name,price,description, weight, itemNum);
    
    }
    public String GetData(){
        return "Product: " + name + ", Price: " + price + ", Weight:" + weight + ", Item Number: " + itemNum;
    }  
    
}
