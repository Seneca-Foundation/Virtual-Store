import java.util.ArrayList;
import java.util.List;

public class Cart {

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
        System.out.println(String.Format("{0,-45} | {1,-10}", "Item" , "Price" ));
        System.out.println("--------------------------------------------------------");
        foreach (var i in storeItemsToPurchase)
        {
            System.out.println(String.Format("{0,-45} | {1,-10}", i.name , "$" + i.price ));
            total = total + i.price;
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Total: $" + total);
    }
