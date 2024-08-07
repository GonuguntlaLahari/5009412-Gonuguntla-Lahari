public class App {
    public static void main(String[] args) throws Exception {
        Logger obj=Logger.getObj();
        Logger obj2=Logger.getObj();
        Logger obj3=Logger.getObj();
        System.out.println("First Object, HashCode: "+obj.hashCode());
        System.out.println(obj.i+", "+obj.j);
        System.out.println("Changing values in first object reflects in other objects");
        System.out.println("Second Object, HashCode: "+obj.hashCode());
        obj.i=20; obj.j=50;
        System.out.println(obj2.i+", "+obj3.j);
    }
}
