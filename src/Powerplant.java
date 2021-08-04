public class Powerplant extends WeightItem
{
    public Powerplant(String name, double price,  String description, double weight, int itemNum) 
    {
        super(name,price,description, weight, itemNum);
    }
    public String GetData(){
        return "Product: " + name + " of energy, Price: $" + price + ", Weight:" + weight + ", Item Number: " + itemNum;
    }  
    
}
