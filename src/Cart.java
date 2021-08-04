import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Storeitem> storeItemsToPurchase;
    protected double total;
    
    public Cart()
    {
        storeItemsToPurchase = new List<StoreItem>();
    }

    public void AddToCart(StoreItem itemToAdd) {
        storeItemsToPurchase.Add(itemToAdd);
    }

    public void PrintItems() {
        System.out.println("Thank you for shopping with us. Here are your items and total:");
        System.out.println("--------------------------------------------------------");
        System.out.println(String.Format("{0,-45} | {1,-10}", "Item" , "Price" ));
        System.out.println("--------------------------------------------------------");
        foreach (var i in storeItemsToPurchase)
        {
            System.out.println(String.Format("{0,-45} | {1,-10}", i.Name , "$" + i.Price ));
            total = total + i.Price;
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Total: $" + total);
    }
