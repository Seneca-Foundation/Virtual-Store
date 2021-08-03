public class Powerplant extends Storeitem 
{
    public Powerplant(float price, String name, String description, int itemNum) 
    {
        super(price, name, description, itemNum);
        //TODO Auto-generated constructor stub
    }
    public String GetData(){
        return "Product: " + name + ", Price: " + price + ", Item Number: " + itemNum;
    }  
    
}
