import java.util.ArrayList;
import java.util.List;

public class Cart{


    List<Storeitem> storeItemsToPurchase;
    protected double total;
    
    public Cart()
    {
        storeItemsToPurchase = new ArrayList<Storeitem>();
    }
    

    public void AddToCart(Storeitem itemToAdd) {
        storeItemsToPurchase.add(itemToAdd);
    }

    public void PrintItems() {
        System.out.println("Thank you for shopping with us. Here are your items and total:");
        System.out.println("--------------------------------------------------------");
        System.out.println("Item, Price" );
        System.out.println("--------------------------------------------------------");
        for (var item : storeItemsToPurchase)
        {
            System.out.println(item.name + " $" + item.price);
            //System.out.println(String.format("{0,-45} | {1,-10}", item.name , "$" + item.price ));
            total = total + item.price;
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Total: $" + total);
    }
}
