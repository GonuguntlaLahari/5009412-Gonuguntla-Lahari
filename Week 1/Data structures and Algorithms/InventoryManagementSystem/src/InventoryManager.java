import java.util.HashMap;
//Exercise 1
public class InventoryManager {
    private HashMap<String,Product>inventory;

    public InventoryManager(){
        inventory=new HashMap<>();
    }
    
    public void add(Product product){
        inventory.put(product.getProductId(),product);
    }
    
    public void delete(String productId){
        if(inventory.containsKey(productId))
            inventory.remove(productId);
        else
            System.out.println("Product not found !");
    }
    
    public void update(String id, Product updateProduct){
        if(inventory.containsKey(id))
            inventory.put(id, updateProduct);
        else
            System.out.println("Product not found !");
    }
    
    public void displayInventory(){
        for(Product p:inventory.values())
            System.out.println(p);
    }
    
    public static void main(String[] args) throws Exception {
        InventoryManager inventoryManager=new InventoryManager();

        Product p1=new Product("P001", "Iphone 15 Pro Max", 5, 187000);
        Product p2=new Product("P002", "Macbook Pro M3", 10, 228000.75);
        inventoryManager.add(p1);
        inventoryManager.add(p2);

        System.out.println("Inventory after adding products : ");
        inventoryManager.displayInventory();

        Product newp2=new Product("P002", "Macbook Pro M3 18inch", 20, 298999.99);
        inventoryManager.update("P002", newp2);
        System.out.println("Inventory after modifying products : ");
        inventoryManager.displayInventory();

        inventoryManager.delete("P001");
        System.out.println("Inventory after deleting products : ");
        inventoryManager.displayInventory();
    }
}
