public class CustomerOrder {
    private Order ar[];
    private int index;
    public CustomerOrder(){
        ar=new Order[5];
        index=0;
    }
    public void add(Order order){
        if(index<ar.length)
            ar[index++]=order;
        else   
            System.out.println("Array full !");
    }
    public void displayOrders(){
        System.out.println("The orders are : ");
        for(Order o:ar)
            System.out.println(o);
    }
    public void bubbleSort(){
        int n=ar.length;
        boolean swapped;
        for(int i=0;i<n;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(ar[j].getTotalPrice()>ar[j+1].getTotalPrice()){
                    Order temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false)
                break;
        }
    }
    public int partition(int low,int high){
        double pivot=ar[high].getTotalPrice();
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(ar[j].getTotalPrice()<pivot){
                i++;
                // swap(i,j);
                Order temp=ar[j];
                ar[j]=ar[i];
                ar[i]=temp;
            }
        }
        // swap(i+1,high);
        Order temp=ar[high];
        ar[high]=ar[i+1];
        ar[i+1]=temp;
        return i+1;
    }
    public void quickSort(int low,int high){
        if(low<high){
            int pi=partition(low,high);
            quickSort(low, pi-1);
            quickSort(pi+1, high);
        }
    }
    
    public static void main(String[] args) throws Exception {
        CustomerOrder order1=new CustomerOrder();
        CustomerOrder order2=new CustomerOrder();

        Order o1=new Order("O001", "John Doe", 12000.0012);
        Order o2=new Order("O002", "Alex Costa", 19999.99);
        Order o3=new Order("O003", "Arindom Ghosh", 112000.878);
        Order o4=new Order("O004", "Soham Dutta", 882000.99987);
        Order o5=new Order("O005", "Raju Sen", 18900.67002);

        order1.add(o4);
        order1.add(o2);
        order1.add(o1);
        order1.add(o5);
        order1.add(o3);
        
        order2.add(o4);
        order2.add(o2);
        order2.add(o1);
        order2.add(o5);
        order2.add(o3);

        System.out.println("Sorted using BubbleSort : ");
        order1.bubbleSort();
        order1.displayOrders();
        
        System.out.println("Sorted using QuickSort : ");
        order2.quickSort(0,4);
        order2.displayOrders();
        
    }
}
