public class EmployeeManagement {
    private Employee ar[];
    private int index;
    public EmployeeManagement(){
        ar=new Employee[5];
        index=0;
    }
    public void add(Employee employee){
        if(index>ar.length)
            System.out.println("Array Full !");
        else
            ar[index++]=employee;
    }
    public int search(String id){
        for(Employee e:ar){
            if(e.getEmployeeId().equals(id)){
                System.out.println("Employee found in records !");
                return 1;
            }
        }
        System.out.println("Employee doesnot exist in records !");
        return -1;
    }
    public void traverse(){
        System.out.println("The employees are : ");
        for(Employee e:ar)
            System.out.println(e);
    }
    public void delete(String id){
        System.out.println("\nDeleting...");
        int find=search(id);
        if(find==-1)
            return;
        
        Employee array[]=new Employee[ar.length-1];
        int j=0;
        for(Employee e:ar){
            if(!e.getEmployeeId().equals(id)){
                array[j++]=e;
            }
        }
        ar=array;
        System.err.println("Deleted employee id : "+id);
    }
    public static void main(String[] args) throws Exception {
        EmployeeManagement employeeManagement=new EmployeeManagement();

        Employee e1=new Employee("E001", "Tarak Mehta", "Fighter 1", 290000);
        Employee e2=new Employee("E002", "Batman", "Fighter 65", 2086200);
        Employee e3=new Employee("E003", "Spiderman", "Fighter 20", 7708000);
        Employee e4=new Employee("E004", "Hulk", "Fighter 100", 2908000);
        Employee e5=new Employee("E005", "Ironman", "CEO", 999999);

        employeeManagement.add(e5);
        employeeManagement.add(e2);
        employeeManagement.add(e3);
        employeeManagement.add(e1);
        employeeManagement.add(e4);

        employeeManagement.search("E005");
        employeeManagement.delete("E001");
        employeeManagement.traverse();
    }
}
