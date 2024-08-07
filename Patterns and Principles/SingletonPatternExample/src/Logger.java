public class Logger {
    private static Logger obj=new Logger();
    int i,j;
    private Logger(){
        i=10;
        j=i*2;
        System.out.println("Instance Created");
    }
    public static Logger getObj(){
        return obj;
    }
}