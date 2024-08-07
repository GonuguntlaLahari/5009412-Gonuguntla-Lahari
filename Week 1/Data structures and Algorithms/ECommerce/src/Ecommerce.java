import java.util.Arrays;
import java.util.Comparator;

public class Ecommerce {
    private Product ar[];
    private int index;
    public Ecommerce(){
        ar=new Product[10];
        index=0;
    }
    public void add(Product product){
        if(index>9)
            System.out.println("Product Array Full !");
        else
            ar[index++]=product;
    }
    public void linearSearch(String productId){
        boolean found=false;
        for(Product p:ar){
            if(p.getProductId().equalsIgnoreCase(productId)){
                System.out.println("Product has been found !\n"+p);
                found=true;
                break;
            }
        }
        if(!found)
            System.out.println("Product not found !");
    }
    public void binarySearch(String productId){
        boolean found=false;
        Arrays.sort(ar,Comparator.comparing(Product::getProductId));
        int low=0,high=9;
        while(low<=high){
            int mid=(low+high)/2;
            int comparison=ar[mid].getProductId().compareTo(productId);
            if(comparison==0){
                System.out.println("Product has been found !\n"+ar[mid]);
                found=true;
                break;
            }
            if(comparison<0)
                low=mid+1;
            else
                high=mid-1;
        }
        if(!found)
            System.out.println("Product not found !");
    }
    public static void main(String[] args) throws Exception {
        Ecommerce site=new Ecommerce();

        Product p1=new Product("P001", "Sugar", "Ration");
        Product p2=new Product("P002", "Rice", "Cereals");
        Product p3=new Product("P003", "Wheat", "Cereals");
        Product p4=new Product("P004", "Water", "Drinks");
        Product p5=new Product("P005", "CNG", "Commodity");
        Product p6=new Product("P006", "Car", "Vehicle");
        Product p7=new Product("P007", "Bike", "Vehicle");
        Product p8=new Product("P008", "Helicopter", "Vehicle");
        Product p9=new Product("P009", "Biriyani", "Main course");
        Product p10=new Product("P010", "Coffee", "Drinks");

        site.add(p10);
        site.add(p1);
        site.add(p9);
        site.add(p2);
        site.add(p3);
        site.add(p6);
        site.add(p4);
        site.add(p7);
        site.add(p5);
        site.add(p8);

        site.linearSearch("P008");
        site.binarySearch("P002");
    }
}
