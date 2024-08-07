public class LibraryManagement {
    private Book ar[];
    private int index;
    public LibraryManagement(){
        ar=new Book[8];
        index=0;
    }
    public void add(Book book){
        if(index<ar.length)
            ar[index++]=book;
        else
            System.err.println("Array Full !");
    }
    public void linearSearch(String title){
        for(Book t:ar){
            if(t.getTitle().equals(title)){
                System.out.println("Book Found title : "+title);
                return;
            }
        }
        System.out.println("Book Not Found ! ");
    }
    public void binarySearch(String title){
        int left=0,right=ar.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            int compare=ar[mid].getTitle().compareTo(title);
            if(compare==0){
                System.out.println("Book found title : "+title);
                return;
            }
            else if(compare<0)
                left=mid+1;
            else
                right=mid-1;
        }
        System.out.println("Book Not Found title : "+title);
    }
    public static void main(String[] args) throws Exception {
        LibraryManagement libraryManagement=new LibraryManagement();
        
        Book b2=new Book("B002","Alexa", "Robin");
        Book b3=new Book("B003","Google", "Steve");
        Book b4=new Book("B004","Nuclear", "Oppenheimer");
        Book b5=new Book("B005","Microsoft", "Aryabhatta");
        Book b6=new Book("B006","Plant", "Gosling");
        Book b7=new Book("B007","Space", "James");
        Book b8=new Book("B008","Arts", "Lewis");
        Book b9=new Book("B009","Cars", "Faraday");
        Book b1=new Book("B001","Software Engineering", "Tim");

        libraryManagement.add(b2);
        libraryManagement.add(b8);
        libraryManagement.add(b9);
        libraryManagement.add(b3);
        libraryManagement.add(b5);
        libraryManagement.add(b4);
        libraryManagement.add(b6);
        libraryManagement.add(b7);
        libraryManagement.add(b1);

        System.out.println("Linear Search ...");
        libraryManagement.linearSearch("Nuclear");

        System.out.println("Binary Search ...");
        libraryManagement.binarySearch("Space");
    }
}
